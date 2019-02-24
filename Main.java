import java.util.Scanner;

public class Main {

	

	private static Scanner input;

	public static void main(String[] args) {
		
		
		/* Scanner is a class in java.util package used for obtaining the input of the primitive types;
		 * The values of the triangle will be inserter from the keyboard by the user;
		 * The inserted values will be then recorded as double in the variables: side 1, side 2, side 3; 
		 * 
		 */
		

		input = new Scanner(System.in);
		System.out.println("Enter the first side of the triangle: ");
	
		
		//records the value of the user (the input) as double
		double side1 = input.nextDouble();
		
		
		System.out.println("Enter the second side of the triangle: ");
		double side2 = input.nextDouble();
		
		
		System.out.println("Enter the third side of the triangle: ");
		double side3 = input.nextDouble();
		
	   
            
	
	    //check if the values are not negative or 0
	    
	    if(side1<=0 || side2<=0 || side3 <=0) {
	    	
	    	System.out.println("Negative values and less than 0 are not allowed. Please try again!");
	    	return;	
	    }
	    
	    
	    /* to create a triangle we should know that the sum of the lengths of any two sides of a triangle 
		 * must be greater than or equal to the length of the third side
		 */
	    if  ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
	           System.out.println("Valid triangle!");
	       } else {
	           System.out.println("The sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.\nPlease try again!");
	           return;
	       }
	    	
	  
	  
	    /* one object corresponding to the TriangleConditions class;
		 * Calling the appropriate methods through the object using as arguments the values inserted by the user
		 * Through the particular methods if-statement blocks conditions will be checked.
		 * When a method is accomplished, a message with the type of the triangle will be displayed in the console   
		*/
	    
	    TriangleConditions triangle= new TriangleConditions(); 
	    
	    triangle.equilateral_check(side1, side2, side3);
		
	    triangle.isosceles_check(side1, side2, side3);
		
	    triangle.scalene_check(side1, side2, side3);
		
	    
	}

}
