import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		String input = br.readLine();
		int cuttedBars = 0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '(') {
				stack.push('(');
			}
			else if(input.charAt(i) == ')') {
				if(input.charAt(i-1) == '(') {
					cuttedBars += stack.size()-1;
				}else {
					++cuttedBars;
				}
				stack.pop();
			}
		}
		System.out.println(cuttedBars);
	}
}
