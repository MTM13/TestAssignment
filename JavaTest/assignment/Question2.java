package assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter anumber to check if less than 200 & even!");
		
		int num = scan.nextInt();
		
		if(num < 200 && num %2==0) {
			System.out.println("Pass");
		}else {
			System.out.println("invalid number!!!");
		}
	}

}

	

