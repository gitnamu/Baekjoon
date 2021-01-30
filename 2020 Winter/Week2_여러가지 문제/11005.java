import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        String answer = "";
        while(n>0) {
        	int tmp = n%b;
        	if(tmp > 9) {
        		answer = (char)(tmp+55) + answer;
        	}else {
        		answer = tmp + answer; 
        	}
        	n/=b;
        }
        System.out.println(answer);
    }
}
