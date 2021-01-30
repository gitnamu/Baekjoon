import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        double answer = 0;
        
       for(int i=n.length()-1;i>=0;i--) {
    	   char aChar = n.charAt(n.length()-i-1);
    	   int aNumber = 0;
    	   if(aChar >= 65) {
    		   aNumber = aChar - 55;
    	   }else {
    		   aNumber = aChar - 48;
    	   }
    	   answer += aNumber * Math.pow(b, i);
       }
        System.out.println((int)answer);
    }
}
