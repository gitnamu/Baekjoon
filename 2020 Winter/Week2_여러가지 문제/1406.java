import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int commandLength = sc.nextInt();
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		for(int i=0;i<word.length();i++) {
			left.push(word.charAt(i));
		}
		
		for(int i=0;i<commandLength;i++) {
			char command = sc.next().charAt(0);
			
			switch(command) {
			case 'L':
				if(!left.isEmpty())		right.push(left.pop());
				break;
			case 'D':
				if(!right.isEmpty())	left.push(right.pop());
				break;
			case 'B':
				if(!left.isEmpty())		left.pop();	
				break;
			case 'P':
				left.push(sc.nextLine().charAt(1));	
				break;
			}
		}
		while(!left.isEmpty()) 		right.push(left.pop());
		while(!right.isEmpty())		System.out.print(right.pop());
	}
}
