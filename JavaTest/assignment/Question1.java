package assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter two numbers to check!");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		boolean var1 = (num1>=100)? true : false ;
		if(var1==true) {
			System.out.println("First number is greater than or equal 100");
		}else {
			System.out.println("First number is less than 100");
		}
		boolean var2 = (num2>=100)? true : false ;
		if(var2==true) {
			System.out.println("Second number is greater than or equal 100");
		}else {
			System.out.println("Second number is less than 100");
		}
		

	}

}
