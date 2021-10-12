package homeworkWeek6;
/*
Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */

public class Programme17 {

    public void decimal() { //instance  variable
        int input = 5;
        String abc = Integer.toBinaryString(input);
        System.out.println(abc);
    }

    public static void main(String[] args) { //main method
        Programme17 obj = new Programme17();// object creation
        obj.decimal();
    }


}
