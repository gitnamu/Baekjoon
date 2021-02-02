import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
	static ArrayList<Integer>[] list;
	static int[] visited;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int c=0;c<t;c++) {
        	int v = Integer.parseInt(br.readLine());
        	
        	visited = new int[v+1];
        	list = new ArrayList[v+1];
        	
        	for(int i=1;i<=v;i++) {
        		list[i] = new ArrayList<Integer>();
        	}
        	
        	String line = br.readLine();
        	StringTokenizer st = new StringTokenizer(line);
        	
        	for(int i=1;i<=v;i++) {
        		int node = Integer.parseInt(st.nextToken());
        		
        		list[i].add(node);
        	}
        	int count = 0;
        	for(int i=1;i<=v;i++) {
        		if(visited[i] == 0) {
        			++count;
        			bfs(i);
        		}
        	}
        	bw.write(count+"\n");
        	bw.flush();
    	}
    }
    
    public static void bfs(int start) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	
    	q.offer(start);
    	visited[start] = 1;
    	
    	while(!q.isEmpty()) {
    		int node = q.poll();
    		
    		for(int i : list[node]) {
    			if(visited[i] == 0) {
					q.offer(i);
    				visited[i] = visited[node]*-1;
				}
    		}
    	}
    }
}
