import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] dp = new int[n];
		
		nums[0] = sc.nextInt();
		dp[0] = nums[0];
		int max = nums[0];
		
		for(int i=1;i<n;i++) {
			nums[i] = sc.nextInt();
			
			dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
			if(dp[i]>=max) 
				max=dp[i];

		}
		System.out.println(max);
    }
}
