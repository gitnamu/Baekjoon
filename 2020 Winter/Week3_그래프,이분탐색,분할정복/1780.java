import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        count = new int[3];
        StringTokenizer st;
        
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0;j<n;j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());	
        	}
        }
        divide(0,0,n);
        
        for(int i=0;i<3;i++) {
        	bw.write(count[i]+"\n");
        }
        bw.flush();
    }
    
    private static void divide(int startRow, int startCol, int n) {
        if (checkAllSame(startRow, startCol, n)) {
        	++count[arr[startRow][startCol]+1];
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divide(startRow + n/3*i, startCol + n/3*j, n/3);
                }
            }
        }
    }
    
    private static boolean checkAllSame(int startRow, int startCol, int n) {
        int sample = arr[startRow][startCol];
        
        for (int i = startRow; i < startRow + n; i++) {
            for (int j = startCol; j < startCol + n; j++) {
                if (arr[i][j] != sample) return false;
            }
        }
        return true;
    }
}
