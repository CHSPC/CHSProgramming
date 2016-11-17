public class Main {
	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) { //If i is divisible by both 3 and 5 then print FizzBizz
				System.out.println("FizzBuzz");
			} 
			else if (i % 3 == 0) { // If only div by 3 print Fizz
				System.out.println("Fizz");
			} 
			else if (i % 5 == 0) { //If only div by 5 print Bizz
				System.out.println("Buzz");
			} 
			else { //If none then print the number
				System.out.println(i);
			}
		}
	}
}
