package homeworkWeek6;

/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */
import java.util.Scanner;

public class Programme6 {

    public void circleRadius (double r){ //instance method
        double pi = 3.142;
        double s = pi * r *r;
        System.out.println("Radius of Circle " +s);

    }

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Programme6 obj1 = new Programme6();//object creation
        obj1.circleRadius(radius);


    }


}
