import java.io.BufferedReader;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        List<String> list = readDictionary("dictionary.txt");
        String[] words = list.toArray(new String[list.size()]);
        mergeSort(words);
        System.out.println(String.join("\n", words));
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put in a word to search for: ");
        String wordSearch = scan.nextLine().toLowerCase();
        System.out.println(search(words, wordSearch) == true ? "Your word is in the dictionary" : "Your word does not exist");
    }

public static void mergeSort(String[] names) {
        if (names.length > 2) {
            String[] left = new String[names.length / 2];
            String[] right = new String[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(names, left, right);
        }
    }

    public static void merge(String[] names, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }

    public static List<String> readDictionary(String fileName){
        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
 			e.printStackTrace();
 		}
        return null;
    }
    public static boolean search(String[] A, String T){
		int L = 0, R = A.length - 1;
		while(L <= R){
			int m = (int)Math.floor((L+R)/2);
			if(A[m].compareTo(T) < 0) L = m + 1;
            if(A[m].compareTo(T) > 0) R = m - 1;
			if(A[m].equals(T)) return true; 
		}
		return false;
	}
}