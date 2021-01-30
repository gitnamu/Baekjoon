import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n == 0) {
        	System.out.println(0);
        	return;
        }
        StringBuilder sb = new StringBuilder();
        
        while(Math.abs(n)>0) {
        	int tmp = n%-2;
        	if(tmp<0) {
        		sb.insert(0,1);
        		n = (n-1)/-2;
        	}else {
        		sb.insert(0,tmp);
            	n /= -2;
        	}
        }
       System.out.println(sb);
    }
}
