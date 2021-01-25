package assignment;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter a day name to select the movies");
		String  M = scan.next().toUpperCase().substring(0, 1);
		String  T = scan.next().toUpperCase().substring(0, 1);
		String  W = scan.next().toUpperCase().substring(0, 1);
		String  Th = scan.next().toUpperCase().substring(0, 1);
		String  F = scan.next().toUpperCase().substring(0, 1);
		String  S = scan.next().toUpperCase().substring(0, 1);
		String  Su = scan.next().toUpperCase().substring(0, 1);

		switch (M) {

		         case "A":  System.out.println("A");
		       
		         case "B":  System.out.println("B");
		          break;
		      }

		switch (T) {

        case "A":  System.out.println("A");
      
        case "B":  System.out.println("B");
         break;
		}
         switch (W) {

         case "A":  System.out.println("A");
       
         case "B":  System.out.println("B");
          break;
         }
          switch (Th) {

	         case "A":  System.out.println("A");
	       
	         case "B":  System.out.println("B");
	          break;
		     
          }
          }
         }

         
	
		
