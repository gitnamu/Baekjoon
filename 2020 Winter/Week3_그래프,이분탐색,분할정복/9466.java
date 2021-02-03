import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class Main {
	static LinkedList<Integer>[] list;
	static int[] visited;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int c=0;c<t;c++) {
        	int v = Integer.parseInt(br.readLine());
        	
        	visited = new int[v+1];
        	list = new LinkedList[v+1];
        	
        	for(int i=1;i<=v;i++) {
        		list[i] = new LinkedList<Integer>();
        	}
        	
        	String line = br.readLine();
        	StringTokenizer st = new StringTokenizer(line);
        	
        	for(int i=1;i<=v;i++) {
        		int node = Integer.parseInt(st.nextToken());
        		
        		list[i].add(node);
        	}
        	
        	int count = v;
        	
        	for(int i=1;i<=v;i++) {
        		if(visited[i] == 0) {
        			count -= check(i);
        		}
        	}
        	bw.write(count+"\n");
        	bw.flush();
    	}
    }
    
    public static int check(int start) {
    	
    	Stack<Integer> stack = new Stack<Integer>();

    	int nextNode = start;
    	visited[nextNode] = 1;
    	stack.push(nextNode);
    	
    	while(list[nextNode].iterator().hasNext()) {
    		nextNode = list[nextNode].iterator().next();
    		if(visited[nextNode] == 0) {
    			stack.push(nextNode);
    			visited[nextNode] = 1;
    		} else break;
    	}
    	
    	int count = 0;
    	
    	while(!stack.isEmpty()) {
    		++count;
			if(stack.pop() == nextNode) {
				return count;
			}
		}
		return 0;
    }
}
