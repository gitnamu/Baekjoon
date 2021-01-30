import java.util.Scanner;
import java.util.Stack;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int aToDecimal = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--) {
        	aToDecimal += Math.pow(a,i) * sc.nextInt();
        }
        
        while(aToDecimal > 0) {
        	stack.push(aToDecimal % b);
        	aToDecimal/=b;
        }

        System.out.print(stack.pop());
        while(!stack.isEmpty()) {
        	System.out.print(" "+stack.pop());
        }
    }
}
