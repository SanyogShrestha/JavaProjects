package Basic;

public class Operators_05 {
    public static void main(String[] args) {
        // Operators are used to perform operations on variables and values

        //Arithmetic Operators
        int x = 10;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        double a = 10;
        double b = 3;
        System.out.println(a / b);

        //Incrementing and Decrementing
        int z = 5;
        ++z; //Increase values by 1
        System.out.println(z);
        --z; //Decrease values by 1
        System.out.println(z);



        //Assignment Operators
        int num = 10;
        num += 3;
        num -= 3;
        num *= 3;
        num /= 3;
        num %= 3;
        num &= 3;
        num |= 3;
        num ^= 3;
        num >>= 3;
        num <<= 3;


        int salary = 25000;
        salary += 30000;
        System.out.println(salary);



        //Comparison Operators
             /* == 	Equal to 	                x == y
                != 	Not equal               	x != y
                > 	Greater than 	            x > y
                < 	Less than 	                x < y
                >= 	Greater than or equal to 	x >= y
                <= 	Less than or equal to   	x <= y  */
        //Example
        int age = 18;
        System.out.println(age >= 18);
        System.out.println(age < 18);

        int pinLength = 6;
        System.out.println(pinLength >= 8);
        System.out.println(pinLength < 8);



        //Logical Operators
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        // &&:  Returns true if both statements are true
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        // ||:  Returns true if one of the statements is true
        System.out.println("Not logged in: " + (!isLoggedIn));
        //  !:  Reverse the result, returns false if the result is true



        //Operator Precedence
        /*
        from highest to lowest priority:
         () - Parentheses
         *, /, % - Multiplication, Division, Modulus
         +, - - Addition, Subtraction
         >, <, >=, <= - Comparison
         ==, != - Equality
         && - Logical AND
         || - Logical OR
         = - Assignment
        */

        int result1 = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;

        System.out.println(result1);
        System.out.println(result2);

        //Subtraction and addition are done from left to right;
        int result3 = 10 - 2 + 5;
        int result4 = 10 - (2 + 5);

        System.out.println(result3);
        System.out.println(result4);















    }
}
