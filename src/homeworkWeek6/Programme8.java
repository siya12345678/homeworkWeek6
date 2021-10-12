package homeworkWeek6;

import java.util.Scanner;

public class Programme8 {
/*
Write a program to calculate the area of a triangle.
 */

    public void area(float j, float s) { //instance method

        float ans = j * s;

        System.out.println("Area of Triangle = " + (j * s / 2));
    }

    public static void main(String[] args) { //main method
        System.out.println("Please Enter two for calculation ");
        Scanner scanner = new Scanner(System.in);//scanner class
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        Programme8 obj2 = new Programme8(); //object creation
        obj2.area(a, b);

    }


}
