import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		String word = sc.nextLine();
		
		for(int i=0;i<word.length();i++) {
			arr[word.charAt(i) - 97]++;
		}
		
		System.out.print(arr[0]);
		for(int i=1;i<26;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
