package homeworkWeek6;
/*      Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.

 */

public class Programme4 {
   //instance variable
    int a = 20;
    int b = 40;
    //static variable
    static String name = "Siya";
    static String age = "3";

    public void myMethode1() { //instance method
        int value = a + b;
        System.out.println("Result = " + value);
        System.out.println("name =" + name +  " age =" + age);
    }

    public static void myMethod2() {  //static method
        System.out.println(name);
        System.out.println(age);
        Programme4 obj = new Programme4();
        System.out.println("Result = " + (obj.a + obj.b));

    }

    public static void main(String[] args) {  //main method
        Programme4 value = new Programme4();
        value.myMethode1();

        myMethod2();//static method call directly
    }


}
