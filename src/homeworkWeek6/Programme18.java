package homeworkWeek6;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

public class Programme18 {
    int j = 125;
    int v = 24;
     public void operation(){ ////instance  variable
         System.out.println("Addition 125 and 24 is " +(j+v));
         System.out.println("Subtract 125 and 24 is " +(j-v));
         System.out.println("Multiplication 125 and 24 is " +(j*v));
         System.out.println("Division 125 and 24 is " +(j/v));
         System.out.println("Modulus 125 and 24 is " +(j%v));
     }

    public static void main(String[] args) { //main method
         Programme18 obj1 = new Programme18(); //object creation
        obj1.operation();
    }
}
