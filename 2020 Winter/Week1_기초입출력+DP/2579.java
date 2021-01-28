import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int[] scores = new int[Math.max(n+1, 3)];
		int[] dp =  new  int[Math.max(n+1, 3)];
		
		for(int i=1;i<=n;i++) {
			scores[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = scores[1];
		dp[2] = scores[1] + scores[2];
		
		for(int i=3;i<=n;i++) {
			dp[i] = Math.max(dp[i-3] + scores[i-1] + scores[i], dp[i-2] + scores[i]);
		}
		System.out.println(dp[n]);
    }
}
