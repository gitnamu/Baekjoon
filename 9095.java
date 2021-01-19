import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dp = new int[12];
		 dp[1] = 1; dp[2] = 2; dp[3] = 4;
		int t = sc.nextInt();
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();

			for(int i=4;i<=n;i++) {
				dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
			}
			System.out.println(dp[n]);
		}
	}
}
