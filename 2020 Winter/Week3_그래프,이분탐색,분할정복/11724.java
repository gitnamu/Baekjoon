import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	static boolean[][] edge;
	static boolean[] visited;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String firstLine = br.readLine();
    	StringTokenizer st = new StringTokenizer(firstLine);
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    		
    	edge = new boolean[n+1][n+1];
    	visited = new boolean[n+1];
    	
    	for(int i=0;i<m;i++) {
    		String line = br.readLine();
    		st = new StringTokenizer(line);
    		
    		int tail = Integer.parseInt(st.nextToken());
    		int head = Integer.parseInt(st.nextToken());
    		
    		edge[head][tail] = true;
    		edge[tail][head] = true;
    	}
    	
    	int count = 0;
    	
    	for(int i=1;i<=n;i++) {
    		if(!visited[i]) {
    			dfs(n,i);
    			++count;
    		}
    	}
    	
    	bw.write(Integer.toString(count));
    	bw.flush();
    }
    
    public static void dfs(int n, int start) {
    	visited[start] = true;
    	
    	for(int i=0;i<=n;i++) {
    		if(edge[start][i] && !visited[i]) {
    			dfs(n,i);
    		}
    	}
    }
}
