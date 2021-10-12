package homeworkWeek6;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5 {
    public static void addition(double j, double v) {   //Static method
        System.out.println("Sum of variable " + (j + v));
    }

    public static void subtraction(double j, double v) {  //Static method
        System.out.println("Subtraction of variable " + (j - v));
    }

    public void multiplication(double j, double v) {   //Instance method
        System.out.println("multiplication of variable " + (j * v));
    }

    public void division(double j, double v) {    //Instance method
        System.out.println("division of variable " + (j / v));
    }

    public static void main(String[] args) {  // main method
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        double p = scanner.nextDouble();
        addition(s, p);
        subtraction(s, p);
        Programme5 obj = new Programme5(); //object
        obj.multiplication(s, p);
        obj.division(s, p);


    }


}
