package homeworkWeek6;
/*
Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) { //main method
    int s , v , p;
    Scanner scanner = new Scanner(System.in); //scanner class
    System.out.println("Input the first number: ");
    s = scanner.nextInt();
    System.out.println("Input the second number: ");
    v = scanner.nextInt();

    p = s;
    s = v;
    v = p;
    //This is statement
    System.out.println(" Swapped values are3 : " + s + " and " + v);
}

    }

