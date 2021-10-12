package homeworkWeek6;
/*
Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 */

public class Programme16 {
    int s = 10;
    int p = 11;

    public void myMethod() {  //instance  variable

        System.out.println("My First Binary Number is " + s);
        System.out.println("My Second Binary Number is " + p);
        Integer integer = Integer.parseInt(String.valueOf(s), 2);
        Integer integer1 = Integer.parseInt(String.valueOf(p), 2);
        Integer add = integer + integer1;
        System.out.println("Addition of given two Binary number is " + Integer.toBinaryString(add));

    }

    public static void main(String[] args) { //main method

        Programme16 obj = new Programme16();//object creation
        obj.myMethod();

    }
}
