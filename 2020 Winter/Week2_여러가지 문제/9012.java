import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++) {
			Stack<Integer> stack = new Stack<>();
			String[] input = br.readLine().split("");
			boolean wrong = false;
			
			for(int j=0;j<input.length;j++) {
				if(input[j].compareTo("(") == 0) {
					stack.push(1);
				}
				else if(input[j].compareTo(")") == 0) {
					if(stack.isEmpty()) {
						wrong = true;
						break;
					}
					stack.pop();
				}
			}
			if(stack.isEmpty() && !wrong) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}
