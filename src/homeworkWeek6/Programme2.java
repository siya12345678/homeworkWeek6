package homeworkWeek6;
/*
Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme2 {   //static variable
    static int j = 18;
    static String name = "Shiv";

    public static void testMethod() {   //static method
        System.out.println(j);
        System.out.println(name);

    }

    public static void main(String[] args) { //main method

        testMethod();

    }


}
