import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] graph;
    static int[] xy = {0,-1,+1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
        	String wh = br.readLine();
            StringTokenizer st = new StringTokenizer(wh);
            
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            
            if(w == 0 && h == 0) break;
            
            graph = new int[h][w];
            int count = 0;
            
            for (int i=0;i<h;i++){
            	String line = br.readLine();
            	st = new StringTokenizer(line);
            	
            	for(int j=0;j<w;j++) {
            		graph[i][j] = Integer.parseInt(st.nextToken());	
            	}
            }
            
            for(int i=0;i<h;i++) {
            	for (int j=0;j<w;j++){
                    if (graph[i][j] == 1) {
                    	dfs(w,h,i,j);
                    	++count;
                    }
                }
            }
            
            bw.write(count+"\n");
            bw.flush();
        }
        
    }
    
    public static void dfs(int w, int h, int i, int j){
    	graph[i][j] = -1;
    	
    	for(int a=0;a<3;a++) {
    		int nextI = i+xy[a];
    		for(int b=0;b<3;b++) {
        		int nextJ = j+xy[b];
        		
        		if(nextI>=0 && nextI<h && nextJ>=0 && nextJ<w) {
        			if(graph[nextI][nextJ] == 1) {
        				dfs(w,h,nextI,nextJ);
                	}
        		}
    		}
    	}
    }
}
