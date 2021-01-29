import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		ArrayDeque<String> answer = new ArrayDeque<String>();
		answer.addLast("<");
		
		for(int i=1;i<=n;i++) {
			q.addLast(i);
		}
		
		for(int i=0;i<k-1;i++) {
			q.addLast(q.removeFirst());
		}
		answer.addLast(q.removeFirst()+"");
		
		while(!q.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				q.addLast(q.removeFirst());
			}
			answer.addLast(", "+q.removeFirst());
		}
		answer.addLast(">");
		for(int i=0;i<n+2;i++) {	
			bw.write(answer.pop());	
		}
		bw.flush();
	}
}
