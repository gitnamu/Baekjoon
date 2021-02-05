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
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String wh = br.readLine();
        StringTokenizer st = new StringTokenizer(wh);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        graph = new int[n+1][m+1];
        
        for (int i=1;i<=n;i++){
        	String line = br.readLine();
        	
        	for(int j=1;j<=m;j++) {
        		graph[i][j] = Character.getNumericValue(line.charAt(j-1));
        	}
        }
        
        bw.write(bfs(n,m)+"\n");
        bw.flush();
    }
    
    public static int bfs(int n, int m){
    	Queue<Integer> q = new LinkedList<Integer>();
    	q.offer(1);
    	q.offer(1);
    	graph[1][1] = -1;
    	
    	while(!q.isEmpty()) {
    		int i = q.poll();
    		int j = q.poll();
    		
    		if(i == n && j == m) {
    			return -graph[i][j];
    		}
    		
    		for(int a=0;a<4;a++) {
        		int nextI = i+x[a];
        		int nextJ = j+y[a];
        		
        		if(nextI>0 && nextI<=n && nextJ>0 && nextJ<=m) {
        			if(graph[nextI][nextJ] == 1) {
        				graph[nextI][nextJ] = graph[i][j] - 1;
        				q.offer(nextI);
        				q.offer(nextJ);
    				}
        		}
        	}
    	}
    	return -1;
    }
}
