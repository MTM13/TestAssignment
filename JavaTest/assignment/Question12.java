package assignment;

import java.util.Scanner;

public class Question12 {

	static char input;
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		

		char input;
		System.out.println(
				"What is the command keyword to exit a loop in Java?" 
				+"\na.quit"+
				"\nb.continue"+
				"\nc.break"+
				"\nd.exit"+
				"\nEnter your choice:");

		input = scan.next().toLowerCase().charAt(0);
		if(input=='c') {
			System.out.println("Congratulation!");
			
			
		}do {
		
			input = scan.next().toLowerCase().charAt(0);

			System.out.println("Incorrect!");
			System.out.println("Again? press y to continue:");
			input = scan.next().toLowerCase().charAt(0);

			if(input=='y') {
				System.out.println("Enter your choice:");
				input = scan.next().toLowerCase().charAt(0);
				if(input=='c') {
					System.out.println("Congratulation!");
				}else {
					System.out.println("Invalid input!!!");
				}
			}
		}while(input=='c'); {
			
			
			
			
			
				
			}
				System.out.println("Congratulation!");
			
		
		
		
		
		
	}

}
