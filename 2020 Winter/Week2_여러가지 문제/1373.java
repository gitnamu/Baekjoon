import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int sub = 0;
        
       for(int i=n.length()-1;i>=0;i--) {
    	   int count = (n.length()-i-1) % 3;
    	   sub += (n.charAt(i)-48) * Math.pow(2, count);

    	   if(count == 2 || i == 0) {
    		   sb.insert(0, sub);
    		   sub = 0;
    	   }
       }
        System.out.println(sb);
    }
}
