package homeworkWeek6;
/*
Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Programme12 {

    public static void main(String[] args) { //main method
        double j = 25.5;
        double v = 3.5;
        double s = 40.5;
        double p = 4.5;

        System.out.println("variable j = " + j + "variable v = " + v + "variable s = " + s + "variable p = " + p);
        //This is statement
        System.out.println("Result of Specified Expression = " + ((j * v - v * v) / (s - p)));
    }
}
