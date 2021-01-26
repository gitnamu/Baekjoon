import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nktmp = br.readLine();
		StringTokenizer st = new StringTokenizer(nktmp);
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		String numtmp = br.readLine();
		StringTokenizer numSt = new StringTokenizer(numtmp);
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(numSt.nextToken());
		}
		Arrays.sort(arr);
		
		bw.write(Integer.toString(arr[k-1]));
		bw.flush();
	}
}
