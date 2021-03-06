import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[n+1];
		 dp[1] = 1;
		if (n>=2) {
			dp[2] = 3;	
		}
		if(n >= 3) {
			dp[3] = 5;
		}

		for(int i=4;i<=n;i++) {
			dp[i] = (dp[i-2]*3 + dp[i-3]*2) % 10007;
		}
		System.out.println(dp[n]);
	}
}
