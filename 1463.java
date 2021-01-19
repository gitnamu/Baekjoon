import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] dp = new int[n+1];
		dp[1] = 0;
		
		for(int i=2;i<=n;i++) {
			int min = dp[i-1];
			if(i%3 == 0) {
				min = Math.min(min, dp[i/3]);
			}
			if(i%2 == 0) {
				min = Math.min(min, dp[i/2]);
			}
			dp[i] = min+1;
		}
		System.out.println(dp[n]);
	}
}