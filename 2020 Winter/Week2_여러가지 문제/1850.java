import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long a = sc.nextLong();
		long b = sc.nextLong();
		
		while(b>0) {
			long tmp = a;
			a = b;
			b = tmp%b;
		}
		for(int i=0;i<a;i++) {
			bw.write("1");
		}
		bw.flush();
	}
}
