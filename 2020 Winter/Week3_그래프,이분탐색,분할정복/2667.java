import java.io.*;
import java.util.*;

public class Main {
	static int[][] graph;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i=0;i<n;i++){
        	String line = br.readLine();
        	
        	for(int j=0;j<n;j++) {
        		graph[i][j] = Character.getNumericValue(line.charAt(j));	
        	}
        }
        
        for(int i=0;i<n;i++) {
        	for (int j=0;j<n;j++){
                if (graph[i][j] == 1) {
                	list.add(dfs(i,j));
                }
            }
        }
        
        Collections.sort(list);
        
        bw.write(list.size()+"\n");
        for(int i : list) {
        	bw.write(i+"\n");
        }
        bw.flush();
    }
    
    public static int dfs(int i, int j){
    	int count = 1;
    	graph[i][j] = -1;
    	
    	if(graph[Math.max(0, i-1)][j] == 1) {
    		count += dfs(Math.max(0, i-1),j);
    	}
    	if(graph[Math.min(n-1, i+1)][j] == 1) {
    		count += dfs(Math.min(n-1, i+1),j);
    	}
    	if(graph[i][Math.max(0, j-1)] == 1) {
    		count += dfs(i,Math.max(0, j-1));
    	}
    	if(graph[i][Math.min(n-1, j+1)] == 1) {
    		count += dfs(i,Math.min(n-1, j+1));
    	}
    	return count;
    }
}
