import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        int n = sc.nextInt();
        
        int[][] dp = new int[2][10];
        Arrays.fill(dp[1],1);
        
        for(int i=0;i<n;i++) {
        	int index = i%2;
        	int sum = 0;
        	for(int j=0;j<10;j++) {
        		sum = (sum + dp[1-index][j]) % 10007;
        		dp[index][j] = sum;
        	}
        }
        for(int i=0;i<10;i++) {
        	answer += dp[n%2][i];
        }
        System.out.println(answer%10007);
    }
}
