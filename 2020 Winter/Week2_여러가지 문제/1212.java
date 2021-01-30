import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder();

       
        sb.append(Integer.parseInt(Integer.toBinaryString((n.charAt(0)-48))));
        
        for(int i=1;i<n.length();i++) {
        	sb.append(String.format("%03d", Integer.parseInt(Integer.toBinaryString((n.charAt(i)-48)))));
       }
       
       System.out.println(sb);
    }
}
