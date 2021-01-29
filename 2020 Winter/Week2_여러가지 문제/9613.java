import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			
			long answer = 0;
			int[] num = new int[n+1];
			
			for(int j=1;j<=n;j++) {
				num[j] = sc.nextInt();
				
				for(int k=j-1;k>0;k--) {
					int jTmp = num[j];
					int kTmp = num[k];
					
					while(kTmp>0) {
						int tmp = jTmp;
						jTmp = kTmp;
						kTmp = tmp % kTmp;
					}
					answer += jTmp;
				}
			}
			bw.write(Long.toString(answer) + "\n");
		}
		bw.flush();
	}
}
