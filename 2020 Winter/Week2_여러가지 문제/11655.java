import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		char[] arr = new char[line.length()];
		
		for(int i=0;i<line.length();i++) {
			int charAt = line.charAt(i);
			
			if(charAt>=65 && charAt<=90) {
				arr[i] = (char)((charAt-52) % 26 + 65);
			}else if(charAt>=97 && charAt<=122) {
				arr[i] = (char)((charAt-84) % 26 + 97);
			}else {
				arr[i] = (char)charAt;
			}
		}
		for(int i=0;i<line.length();i++) {
			System.out.print(arr[i]);
		}
	}
}
