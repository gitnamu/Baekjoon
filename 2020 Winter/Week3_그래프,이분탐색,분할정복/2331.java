import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String line = br.readLine();
    	StringTokenizer st = new StringTokenizer(line);
    	
    	String a = st.nextToken();
    	int p = Integer.parseInt(st.nextToken());
    	
    	LinkedList<Integer> list = new LinkedList();
    	
    	list.offer(Integer.parseInt(a));
    	int index = 0;
    	
    	while(true) {
    		int nextNumber = 0;
    		String[] numberArr = a.split("");
    		
    		for(int i=0;i<numberArr.length;i++) {
    			nextNumber += Math.pow(Integer.parseInt(numberArr[i]), p);
    		}
    		if(list.contains(nextNumber)) {
    			index = list.indexOf(nextNumber);
    			break;
    		}else {
    			list.offer(nextNumber);
    			a = Integer.toString(nextNumber);
    		}
    	}
    	bw.write(Integer.toString(index));
    	bw.flush();
    }
}
