package homeworkWeek6;
/*
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme1 {
    int a = 10;
    int b = 4;

    public static void main(String[] args) {   //main method
        Programme1 ans = new Programme1();
        ans.recall();
    }

    public void recall() {  //instance method
        int ans = a + b;
        System.out.println("Total value = " + ans);
    }

}
