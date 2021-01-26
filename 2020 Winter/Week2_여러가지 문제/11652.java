import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		
		int countMax = 1;
		int count = 1;
		long highFrequencyNum = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i-1] == arr[i]) {
				count++;
			}else count = 1;
			
			if(count>countMax) {
				countMax = count;
				highFrequencyNum = arr[i];
			}
		}
		
		bw.write(Long.toString(highFrequencyNum));
		bw.flush();
	}
}
