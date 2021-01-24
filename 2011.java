import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		String n = sc.next();
		String[] nArr = n.split("");
        int [] dp = new int[n.length()+1];
        dp[0] = 1;
        dp[1] = 1;

        int nArrZero = Integer.parseInt(nArr[0]);
        if(nArrZero == 0) {
        	System.out.println(0);
        	return;
        }
        for(int i=2;i<=n.length();i++) {
        	int parsedI = Integer.parseInt(nArr[i-1]);
        	if(parsedI != 0) dp[i] += dp[i-1];
        	
        	int tmp = Integer.parseInt(nArr[i-2])*10 + parsedI;
        	if(9<tmp && tmp<27) dp[i] = (dp[i] + dp[i-2]) % 1000000;
        }
        System.out.println(dp[n.length()]);
    }
}