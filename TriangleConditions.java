
public class TriangleConditions {
	
	

public void equilateral_check(double l1, double l2, double l3) {
		
		//the if-statement block that checks if all three sides are equal
		
		if (l1==l2 && l1==l3) {
			
			System.out.println("This is a equilateral triangle!");
	}
	

}


public void isosceles_check(double l1, double l2, double l3) {
	
	//if-else if statement verifying that two sides are equal (the 3rd always different)
	
	if (l1==l2 && l1!=l3) {
		
		System.out.println("This is an isosceles triangle!");
	}	
		else if (l1==l3 && l1!=l2) {
			System.out.println("This is an isoscel triangle!");
			
		}
		else if(l2==l3 && l2!=l1) {
			System.out.println("This is an isosceles triangle!");
		}
	}


public void scalene_check(double l1, double l2, double l3 ) {
	
	/* boolean operator &&: it returns a boolean value of true only when the expressions on both sides of && are true 
	* all the sides must be different 
	*/
	
	if (l1!=l2 && l1!=l3 && l2!=l3) {
		System.out.println("This is a scalene triangle!");
	}
	
}
}
