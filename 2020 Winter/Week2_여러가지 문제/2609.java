import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long a2;
		long b2;
		
		if(b>a) {
			a2 = b;
			b2 = a;
		}else {
			a2 = a;
			b2 = b;
		}
		while(b2>0) {
			long tmp = a2;
			a2 = b2;
			b2 = tmp % b2;
		}
		System.out.println(a2);
		System.out.println((a*b)/a2);
	}
}
