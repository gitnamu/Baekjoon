import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			
			long[] dp = new long[Math.max(n, 3)];
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;
			
			for(int j=3;j<n;j++) {
				dp[j] = dp[j-2] + dp[j-3];
			}
			System.out.println(dp[n-1]);
		}
    }
}
