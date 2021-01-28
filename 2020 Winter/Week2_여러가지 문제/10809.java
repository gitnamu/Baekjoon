import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		String word = sc.nextLine();
		
		for(int i=0;i<word.length();i++) {
			if(arr[word.charAt(i) - 97] == -1) {
				arr[word.charAt(i) - 97] = i;
			}
		}
		
		System.out.print(arr[0]);
		for(int i=1;i<26;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
