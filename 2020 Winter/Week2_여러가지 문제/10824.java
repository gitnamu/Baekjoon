import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] num = new long[4];
		
		for(int i=0;i<4;i++) {
			num[i] = sc.nextInt();
		}
		long bLength = String.valueOf(num[1]).length();
		long dLength = String.valueOf(num[3]).length();
		
		long answer = (long) (num[0]*Math.pow(10, bLength) + num[1] + num[2]*Math.pow(10, dLength) + num[3]);
		System.out.println(answer);
	}
}
