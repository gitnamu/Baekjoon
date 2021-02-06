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
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        long left = 0;
        long right = 0;
        
        String trees = br.readLine();
    	st = new StringTokenizer(trees);
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if(right < arr[i]) right = arr[i];
        }

        while(left <= right) {
    		long count = 0;
        	long mid = (left+right)/2;
        	
        	for(int i=0;i<n;i++) {
        		count += Math.max(0,arr[i]-mid);
        	}
        	
        	if(count >= m) {
        		left = mid+1;
        	}
        	else if(count < m) {
        		right = mid-1;
        	}
    	}
        
        bw.write(right+"");
        bw.flush();
    }
}
