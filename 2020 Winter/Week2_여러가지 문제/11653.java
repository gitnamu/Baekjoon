import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	boolean[] arr = new boolean[n+1];
    	arr[1] = true;
    	
    	for(int i=2;i*i<n;i++) {
			if(arr[i] == false) {
				int iter = i*2;
    			while(iter<=n) {
    				arr[iter] = true;
    				iter += i;
    			}
			}
		}

    	while(arr[n]) {
    		for(int i=2;i<n;i++) {
    			if(!arr[i] && n%i==0) {
    				n /= i;
    				sb.append(i).append("\n");
    				break;
    			}
    		}
    	}
    	sb.append(n).append("\n");
    	bw.write(sb.toString());
    	bw.flush();
    }
}
