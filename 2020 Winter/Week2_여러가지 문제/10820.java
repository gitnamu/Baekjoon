import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			
			int[] arr = new int[4];
			
			for(int i=0;i<line.length();i++) {
				int charAt = line.charAt(i);
				
				if(charAt>=97 && charAt<=122) 		arr[0]++;
				else if(charAt>=65 && charAt<=90) 	arr[1]++;
				else if(charAt>=48 && charAt<=57) 	arr[2]++;
				else if(charAt == 32) 				arr[3]++;
			}
			
			for(int i=0;i<4;i++) {
				System.out.print(arr[i] + " ");	
			}
			System.out.println();
		}
	}
}
