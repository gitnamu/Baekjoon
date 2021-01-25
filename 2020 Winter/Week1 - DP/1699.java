import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp,n+1);
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			if(i <=Math.sqrt(n)) {
				dp[i*i] = 1;	
			}
			for(int j=1;j*j<=i;j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		System.out.println(dp[n]);
    }
}
