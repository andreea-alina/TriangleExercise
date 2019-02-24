# TriangleExercise

I have chosen the solution for an user to insert the values from the keyboard. To complete it was necessary to use Scanner class from java.util package used for obtaining the input of the primitive types (double in our case). I chose the primitive type of double take into consideration that the values could be also real numbers.

Once the program runs, the user will have a message in the console asking him to enter the dimension of the sides. The inserted values are converted using a variety of methods specific to the Scanner class - in our case nextDouble().
Once the values are entered they will be recorded in some double variables, named: side1, side2, side3. 

First of all, when we have the values, it is very important to check 2 statements:

1. the sides must have pozitive values and different from 0 - in Main class I added an if-statement block in which I checked the inserted values:

 if (side1<=0 || side2<=0 || side3 <=0) {
    System.out.println("Negative values and less than 0 are not allowed. Please try again!");
    return;	
}

2. to create a triangle we should know that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side - in Main class I added an If-statement block to check this condition:

if  ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
    System.out.println("Valid triangle!");
    } else {
    System.out.println("The sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.\nPlease try again!");
    return;
    }
    
According to the above situations the user will be asked to reinsert proper values. 

After checking that the values are valid, I have created one class called TriangleConditions. It contains 3 methods that verify the equality of sides based on if-statement conditions.

In the case of equilateral triangle, all three sides must be equal - side1 = side2 = side3.
In the case of isosceles triangle, two sides must be equal and different from the third one.
In the case of scalene triangle, all three sides must be different.

In the Main class I have created one instance of the TriangleConditions class ("triangle" object). I called the methods through the triangle object's reference giving as arguments the side1, side2, side3 (the dimensions inserted by the user).

The corresponding message with the type of he triangle will be shown in the console once the if-statement condition for a method is accomplished.





