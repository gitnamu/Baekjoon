import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+m];
        
        String input = br.readLine();
    	st = new StringTokenizer(input);
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	
        }
        
        input = br.readLine();
        
    	st = new StringTokenizer(input);
        for(int i=n;i<n+m;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	
        }
        Arrays.sort(arr);
        
        bw.write(arr[0]+"");
        for(int i=1;i<n+m;i++) {
        	bw.write(" "+arr[i]);
        }
        bw.flush();
    }
}
