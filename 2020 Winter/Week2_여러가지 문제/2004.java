import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String input = br.readLine();
    	StringTokenizer st = new StringTokenizer(input);
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int countTwo = count(n, 2) - count(n-m,2) - count(m,2);
    	int countFive = count(n, 5) - count(n-m,5) - count(m,5);
    	
    	bw.write(Integer.toString(Math.min(countTwo, countFive)));
    	bw.flush();
    }
    
    public static int count(int dividend, int divisor) {
    	int count = 0;

    	while(dividend >= divisor) {
    		count += dividend / divisor;
    		dividend /= divisor;
    	}    	
    	return count;
    }
}
