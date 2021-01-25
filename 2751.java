import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] temp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		temp = new int[arr.length];
		sort(arr, 0, arr.length-1);
		
		for(int i=0;i<n;i++) {
			bw.write(Integer.toString(arr[i]) + "\n");
		}
		bw.flush();
    }
	
	private static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);	
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int p = left;
		int q = mid + 1;
		
		int tmpIndex = p;
		
		while(p <= mid && q <= right) {
			if(arr[p] < arr[q]) {
				temp[tmpIndex++] = arr[p++];
			} else {
				temp[tmpIndex++] = arr[q++];
			}
		}
		
		while(p <= mid) {
			temp[tmpIndex++] = arr[p++];
		}
		while(q <= right) {
			temp[tmpIndex++] = arr[q++];
		}
		
		for(int i=left; i<=right; i++) {
			arr[i] = temp[i];
		}
	}
}
