import java.util.Arrays;
public class BinarySearch{
	public static void main(String[] args){
		//Array to search in
		int[] A = {1,2,3,4,5};
		//Search happens
		System.out.println(search(A, 6));

	}

	public static int search(int[] A, int T){
		//L - minimum index, R - maximum index
		int L = 0, R = A.length - 1;
		//Search condition
		while(L <= R){
			//m - middle index
			int m = (int)Math.floor((L+R)/2);
			//if the middle element is less than the target, then chop off everything to the left
			if(A[m] < T) L = m + 1;
			//if the middle element is bigger, then chop off everthing to the right
			if(A[m] > T) R = m - 1;
			//Hery u found the target, Good job
			if(A[m] == T) return m; 
		}
		//Welp you failed to find the target. GG
		return -1;

	}
}
