package assignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n Enter Character: ");
		char c = ((input.nextLine()).charAt(0));
		char z = Character.toUpperCase(c);

		switch (z) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c + " is a Vowel.");
			break;

		default:
			System.out.println(c + " is a Non-Vowel Character.");
		}

	}
}
