package homeworkWeek6;

/*
10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] arg) { //main method
        int a;
        int b = 1;
        Scanner scanner = new Scanner(System.in);// scanner class
        System.out.println(" Enter any number "); //Print Statement
        a = scanner.nextInt();

        while (b <= 10) {
            //This is a statement
            System.out.println(a + " * " + b + " = " + a * b);
            b++;

        }
    }
}