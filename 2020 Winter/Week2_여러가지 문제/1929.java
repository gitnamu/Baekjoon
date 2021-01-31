import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
    	int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        arr[1] = 1;
        
        for(int i=2;i<=n;i++) {
        	int iter = i*2;
        	while(iter<=n) {
        		if(arr[iter] == 0) {
        			arr[iter] = 1;	
        		}
        		iter +=i;
        	}
        }
        
        for(int i=m;i<=n;i++) {
        	if(arr[i] == 0) {
        		System.out.println(i);
        	}
        }
    }
}
