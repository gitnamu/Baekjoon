import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] graph;
    static int[] x = {0,0,-1,+1};
    static int[] y = {+1,-1,0,0};
    static int changedCount = 0;
    static Queue<Integer> q;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String wh = br.readLine();
        StringTokenizer st = new StringTokenizer(wh);
        
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        graph = new int[h][w];
        q = new LinkedList<Integer>();
        int tomato = w*h;
        int count = 0;
        
        for (int i=0;i<h;i++){
        	String line = br.readLine();
        	st = new StringTokenizer(line);
        	
        	for(int j=0;j<w;j++) {
        		graph[i][j] = Integer.parseInt(st.nextToken());
        		
        		if (graph[i][j] == 1) {
        			q.offer(i);
                 	q.offer(j);
                 	graph[i][j] = 2;
                 	++changedCount;
                 	++count;
                }else if(graph[i][j] == -1) {
                	--tomato;
                }
        	}
        }
        
        int result = bfs(w,h,count);
        
        if(changedCount != tomato) {
        	bw.write("-1\n");
        	bw.flush();
        }else {
        	bw.write(result+"\n");
            bw.flush();
        }
    }
    
    public static int bfs(int w, int h, int count){
    	int copiedCount = 0;
    	int turn = -1;

    	while(!q.isEmpty()) {
    		copiedCount = count;
    		count = 0;
    		
    		for(int c=0; c<copiedCount; c++) {
    			int i = q.poll();
        		int j = q.poll();

        		for(int a=0;a<4;a++) {
            		int nextI = i+x[a];
            		int nextJ = j+y[a];
            		
            		if(nextI>=0 && nextI<h && nextJ>=0 && nextJ<w) {
            			if(graph[nextI][nextJ] == 0) {
            				graph[nextI][nextJ] = 2;
            				q.offer(nextI);
            				q.offer(nextJ);
            				++changedCount;
            				++count;
                    	}
            		}
            	}
    		}
    		++turn;
    	}
    	return turn;
    }
}
