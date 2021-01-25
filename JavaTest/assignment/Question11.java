package assignment;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please, enter year numbers to check if it leap year or not!");
		int year = scan.nextInt();
		scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    
	}

}
