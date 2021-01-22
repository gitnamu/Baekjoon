import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] dp = new int[n];
		int answer = 0;
		
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
			int max = 0;
			for(int j=0;j<i;j++) {
				if(nums[j]<nums[i]) {
					max = Math.max(max, dp[j]);
				}
			}
			dp[i] = max+nums[i];
			answer = Math.max(dp[i], answer);
		}
		System.out.println(answer);
    }
}
