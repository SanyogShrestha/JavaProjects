package Basic;

public class Variables_02 {
    public static void main(String[] args) {

        /* Syntax: type variableName = value;
        variableName is known as Identifiers:
         Cannot start with a digit
         Cannot contain spaces
         Cannot use reserved keywords
        */

        String name = "Sanyog Shrestha";
        System.out.println( "hello " + name); // To combine both text and a variable, use the + character:


        //can also use the + character to add a variable to another variable
        String firstName = "Yunika ";
        String lastName = "Shrestha";
        String fullName = firstName + lastName;

        int a = 15;
        int b;
        b = 20;
        // Without parentheses, Java will treat the numbers as text after the first string:
        System.out.println("The sum is " + a + b);
        System.out.println("The sum is " + (a + b));

        // if we assign a new value to an existing variable, it will overwrite the previous value
        int c = 25;
        c = 30;

        // Using final keyword for unchangeable values
        final int d = 35;

        //To declare more than one variable of the same type, we can use a comma-separated list
        int h = 50, i = 55, j = 60;

        //other variables
        float e = 40.5f;
        char letter = 'f';
        boolean g = true;



        //Real Life Examples
        String studentName = "Zohn Shrestha";
        int studentID = 12;
        int studentAge = 21;
        float studentFee = 2.25f;
        char studentGrade = 'B';

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee + "L");
        System.out.println("Student grade: " + studentGrade);



        //Area of rectangle
        int length = 25;
        int width = 35;
        int area;

        area = length * width;
        System.out.println("Area: " + area);


    }
}
