package Questions;

import java.util.Random;

public class random {

	public static void main(String[] args) {


		
		Random random = new Random();
		
		int rand_int1 = random.nextInt(70); 
        int rand_int2 = random.nextInt(70); 
        int rand_int3 = random.nextInt(70); 
        int rand_int4 = random.nextInt(70); 
        int rand_int5 = random.nextInt(70); 
       
        int mega = random.nextInt(25); 
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2); 
        System.out.println("Random Integers: "+rand_int3); 
        System.out.println("Random Integers: "+rand_int4); 
        System.out.println("Random Integers: "+rand_int5); 
        System.out.println("Random mega: "+mega); 
		
	}

}
