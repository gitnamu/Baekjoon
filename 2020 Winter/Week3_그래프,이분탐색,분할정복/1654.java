import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long left = 1;
        long right = 0;
        
        for(int i=0;i<k;i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        	if(right < arr[i]) right = arr[i];
        }

        while(left <= right) {
    		int count = 0;
        	long mid = (left+right)/2;
        	
        	for(int i=0;i<k;i++) {
        		count += arr[i]/mid;
        	}
        	
        	if(count >= n) {
        		left = mid+1;
        	}
        	else if(count < n) {
        		right = mid-1;
        	}
    	}
        
        bw.write(right+"\n");
        bw.flush();
    }
}
