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
    		String firstLine = br.readLine();
        	StringTokenizer st = new StringTokenizer(firstLine);
        	
        	int v = Integer.parseInt(st.nextToken());
        	int e = Integer.parseInt(st.nextToken());
        	
        	visited = new int[v+1];
        	list = new ArrayList[v+1];
        	
        	for(int i=1;i<=v;i++) {
        		list[i] = new ArrayList<Integer>();
        	}
        	
        	for(int i=0;i<e;i++) {
        		String line = br.readLine();
        		st = new StringTokenizer(line);
        		
        		int tail = Integer.parseInt(st.nextToken());
        		int head = Integer.parseInt(st.nextToken());
        		
        		list[tail].add(head);
        		list[head].add(tail);
        	}
        	boolean answer = true;
        	for(int i=1;i<=v;i++) {
        		if(visited[i] == 0) {
        			if(!bfs(i)) {
        				answer = false;
        				break;
        			}
        		}
        	}
        	if(answer)	bw.write("YES\n");
        	else bw.write("NO\n");
        	
        	bw.flush();
    	}
    }
    
    public static boolean bfs(int start) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	
    	q.offer(start);
    	visited[start] = 1;
    	
    	while(!q.isEmpty()) {
    		int node = q.poll();
    		
    		for(int i : list[node]) {
    			if(visited[i] == 0) {
					q.offer(i);
    				visited[i] = visited[node]*-1;
				}else if(visited[i] == visited[node]){
					return false;
				}
    		}
    	}
		return true;
    }
}
