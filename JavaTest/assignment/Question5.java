package assignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter a year number to check if it leap year or not!");
		
		int year = scan.nextInt();
			
			
			if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
				System.out.format("\n %d is a Leap Year. \n", year);
			}
			else {
				System.out.format("\n %d is NOT a Leap Year. \n", year);
			}
	
	}

}

