import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int wine[] = new int[Math.max(n+1, 3)];
        int dp[] = new int[Math.max(n+1, 3)];

        for (int i = 1; i <= n; i++){
            wine[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];

        for (int i = 3; i <= n; i++){
            dp[i] = Math.max(wine[i]+wine[i-1]+dp[i-3], Math.max(dp[i-1], wine[i]+ dp[i-2]));
        }
        System.out.println(dp[n]);
    }
}