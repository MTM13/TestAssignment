package assignment;

import java.util.Random;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(200);
		System.out.println("The check amount <"+ number +"> Please enter your tips here<%?>");
		int num = scan.nextInt();
		
		int tip = num * number /100 ;
		
		System.out.print("The total amount of tips is: $"); 
		System.out.println( tip);
		System.out.print("The total amount of check after tips is:  $"); 
		System.out.println( number + tip);
	}

}

