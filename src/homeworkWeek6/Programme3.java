package homeworkWeek6;
/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3 {
    int a = 20;//instance variable
    static int b = 30;//static variable

    public void test1() { //instance method

        System.out.println("value of instance variable " + a);
        System.out.println("value of static variable " + b);
    }

    static void test2() { //static method
        Programme3 obj = new Programme3();
        System.out.println("value of instance variable " + obj.a);
        System.out.println("value of static variable " + b);
    }


    public static void main(String[] arg) {  //main method
        Programme3 ans = new Programme3();
        ans.test1();

        test2();

    }

}
