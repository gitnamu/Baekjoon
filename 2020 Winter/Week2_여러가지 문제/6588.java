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
    	
    	int input;
    	boolean[] arr = new boolean[1000001];
    	arr[1] = true;
    	
    	for(int i=2;i<=1000;i++) {
			if(arr[i] == false) {
				int iter = i*2;
    			while(iter<1000000) {
    				arr[iter] = true;
    				iter += i;
    			}
			}
		}
    	
    	while((input = (Integer.parseInt(br.readLine()))) != 0) {	
    		boolean isExist = false;
    		for(int i=3;i<input;i+=2) {
    			int b = input - i;
    			if(!arr[i]&& !arr[b]) {
    				sb.append(input+" = "+i+" + "+b+"\n");
    				isExist = true;
					break;
    			}
    		}
    		if(!isExist) sb.append("Goldbach's conjecture is wrong.\n");
    	}
    	bw.write(sb.toString());
    	bw.flush();
    }
}
