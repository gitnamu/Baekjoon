import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word =  br.readLine();
		int commandLength = Integer.parseInt(br.readLine());
		
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		for(int i=0;i<word.length();i++) {
			left.push(word.substring(i,i+1));
		}
		
		for(int i=0;i<commandLength;i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
             String command = st.nextToken();
			
			switch(command) {
			case "L":
				if(!left.isEmpty())		right.push(left.pop());
				break;
			case "D":
				if(!right.isEmpty())	left.push(right.pop());
				break;
			case "B":
				if(!left.isEmpty())		left.pop();	
				break;
			case "P":
				left.push(st.nextToken());	
				break;
			}
		}
		while(!left.isEmpty()) 		right.push(left.pop());
		while(!right.isEmpty())		bw.write(right.pop());
		bw.flush();
	}
}
