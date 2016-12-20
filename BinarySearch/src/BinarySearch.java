import java.util.Arrays;
public class BinarySearch{
	public static void main(String[] args){
		int[] A = {1,2,3,4,5};
		System.out.println(search(A, 5));

	}

	public static int search(int[] A, int T){
		while(true){
			int L = 0, R = A.length - 1;
			int m = (int)Math.floor((L+R)/2);
			if(A[m] < T) L = m + 1;
			if(A[m] > T) R = m - 1;
			if(A[m] == T) return m; 
		}

	}
}
