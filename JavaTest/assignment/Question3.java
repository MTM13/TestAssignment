package assignment;

public class Question3 {

	public static void main(String[] args) {
		int SetN = 15;
		int A = 0;
		int B = 1;

		System.out.print("Fibonacci Series of " + SetN + " numbers:");

		for (int i = 1; i <= SetN; ++i) {
			System.out.print(A + " ");
		
			int sum = A + B;
			A = B;
			B = sum;
		}
	}
}