package assignment;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {


		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter some numbers to get the sum!");
		int sum = scan.nextInt() ;
		int input =0;
		while(input>=0) {
			
			input = scan.nextInt();
			sum += input;
			System.out.println("the sum of your input numbers is: "+sum);

		}
		System.out.println("You enter unvalid number");
	}

}
