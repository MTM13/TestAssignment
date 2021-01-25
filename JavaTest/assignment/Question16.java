package assignment;

import java.util.Scanner;

public class Question16 {

		static char input;
		public static void main(String[] args) {


			Scanner scan = new Scanner(System.in);
			

			char input;
			System.out.println(
				"What is the correct way to declare a variable to store an integer value in Java?" 
					+"\na. int 1x=10;"+
					"\nb. int x=10;"+
					"\nc. float x=10.0f;"+
					"\nd. string x=\"10\";"+
					"\nEnter your choice:");
			 input = scan.next().charAt(0);
			 
			 
			 
			 
			 if(input == 'a' || input == 'A') {
				 System.out.println("incorrect");
			 }else if(input == 'c' || input == 'C') {
					 System.out.println("incorrect");
			 }else if(input == 'd' || input == 'D') {
						 System.out.println("incorrect");
					 }else if(input == 'b' || input == 'B') {
				 
				 System.out.println("correct");
				 
				 
					 
				 
			 }else {
				 System.out.println("Invalid input!!!");

			 }

	}

}
