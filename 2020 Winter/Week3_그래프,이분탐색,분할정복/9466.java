import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int c=0;c<t;c++) {
        	int v = Integer.parseInt(br.readLine());
        	boolean[] visited = new boolean[v+1];
        	int[] list = new int[v+1];
        	int count = v;
        	
        	String line = br.readLine();
        	StringTokenizer st = new StringTokenizer(line);
        	
        	for(int i=1;i<=v;i++) {
        		int node = Integer.parseInt(st.nextToken());
        		list[i] = node;
        	}
        	
        	for(int i=1;i<=v;i++) {
        		if(!visited[i]) {
        			count -= check(list,visited,i);
        		}
        	}
        	
        	bw.write(count+"\n");
        	bw.flush();
    	}
    }
    
    public static int check(int[] list, boolean[] visited, int start) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int count = 0;
    	int nextNode = start;
    	
    	visited[nextNode] = true;
    	stack.push(nextNode);
    	
    	while(true) {
    		nextNode = list[nextNode];
    		if(!visited[nextNode]) {
    			stack.push(nextNode);
    			visited[nextNode] = true;
    		} else break;
    	}
    	
    	while(!stack.isEmpty()) {
    		++count;
			if(stack.pop() == nextNode) {
				return count;
			}
		}
		return 0;
    }
}
