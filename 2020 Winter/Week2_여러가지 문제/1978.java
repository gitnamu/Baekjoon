import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        
        for(int i=0;i<n;i++) {
        	arr[i] = sc.nextInt();
        	if(arr[i] > max) {
        		max = arr[i];
        	}
        }
        
        int[] num = new int[max+1];
        num[1] = 1;
        
        for(int i=2;i<=max;i++) {
        	int m = i*2;
        	while(m<=max) {
        		if(num[m] != 1) {
        			num[m] = 1;	
        		}
        		m +=i;
        	}
        }
        
        int primeCount =  0;
        
        for(int target: arr) {
        	if(num[target] == 0) {
        		++primeCount;
        	}
        }
        System.out.println(primeCount);
    }
}
