import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int countTwo = 0;
    	int countFive = 0;
    	int answer = 0;

    	for(int i=2; i<=n; i++) {
    		if(i%2 == 0) {
    			int j = 2;
    			while(i%j == 0) {
    				++countTwo;
    				j *= 2;
    			}
    		}
    		
    		if(i%5 == 0) {
    			int j = 5;
    			while(i%j == 0) {
    				++countFive;
    				j *= 5;
    			}
    		}
    		
    		if(countTwo>0 && countFive>0) {
    			int min = Math.min(countTwo, countFive);
    			answer += min;
    			countTwo -= min;
    			countFive -= min;
    		}
    	}
    	bw.write(Integer.toString(answer));
    	bw.flush();
    }
}
