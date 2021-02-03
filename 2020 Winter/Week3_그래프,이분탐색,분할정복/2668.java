import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> list;
    public static boolean[] done;
    public static boolean[] visit;
    
    public static void dfs(int[] graph, int currentVertex){
    	if(visit[currentVertex]) {
    		done[currentVertex] = true;
    		list.add(currentVertex);
    	}
    	else visit[currentVertex] = true;
    	
    	int nextVertex = graph[currentVertex];
    	if(!done[nextVertex]) dfs(graph,nextVertex);
    	
    	visit[currentVertex] = false;
    	done[currentVertex] = true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] graph = new int[n+1];
        done = new boolean[n+1];
        visit = new boolean[n+1];
        list = new ArrayList<Integer>();
        
        for (int j = 1; j <= n; j++){
            graph[j] = Integer.parseInt(br.readLine());
        }
        
        for (int j = 1; j <= n; j++){
            if (!done[j]) {
            	dfs(graph, j);
            }
        }
        
        Collections.sort(list);
        
        bw.write(list.size()+"\n");
        for(int i : list) {
        	bw.write(i+"\n");
        }
        bw.flush();
    }
}
