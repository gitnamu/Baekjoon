import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		String[] suffixArr = new String[word.length()];
		
		for(int i=0;i<suffixArr.length;i++) {
			suffixArr[i] = word.substring(i,word.length());
		}
		Arrays.sort(suffixArr);
		
		for(String suffix : suffixArr) {
			System.out.println(suffix);
		}
		
	}
}
