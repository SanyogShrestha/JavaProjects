package Basic;

public class Java09_IfElse {
    public static void main(String[] args) {
       // Every if statement needs a condition that results in true or false.

        boolean isCold = true;
        if (isCold) {
            System.out.println("Wear thick clothes");
        }

        //Most often, conditions are created using comparison operators
        // a<b , a<=b , a>b , a>=b , a==b , a!=b
        // if, else, else if and switch

        //if : statement specifies a block of code to be executed if a condition is true:
        if ( 20 > 10) {
            System.out.println("20 is greater than 10");
        }



        boolean isLightOn = false;
        if (isLightOn) {
            System.out.println("The light is on.");  // This will not be printed
        }
        System.out.println("This line runs no matter what, because it is outside the if statement.");

        //If an if statement has only one line of code, we can write it without curly braces { }:
        int x = 10;
        if (10 == x)
            System.out.println("x is equal to 10"); //First line only belongs to if without curly bracket.

        // else :statement does not have a condition - it runs when the if condition is false.
        int a = 15;
        if ( a > 20 ) {
            System.out.println("a is greater than 20");
        } else {
            System.out.println("a is less than 20");
        }


        // else if :statement to specify a new condition if the first condition is false.
        int marks = 1;
        if (marks == 3) {
            System.out.println("Topper student");
        } else if (marks == 2) {
            System.out.println("Middle student");
        } else {
            System.out.println("failure");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //Short Hand if else
        int time2 = 20;
        System.out.println((time2 < 18) ? "Good day." : "Good evening.");

        //nested ternary
        int time3 = 22;
        String message = (time3 < 12) ? "Good morning."
                : (time3 < 18) ? "Good afternoon."
                : "Good evening.";
        System.out.println(message);

        //-------------------------------

        //Nested if :  place an if statement inside another if
        int ab = 15;
        int ba = 25;
        if (ab > 10) {
            System.out.println("x is greater than 10");
            // Nested if
            if (ba > 20) {
                System.out.println("y is also greater than 20");
            }
        }



        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }


        /* Logical Operators in Conditions
        && (AND) - all conditions must be true
        || (OR) - at least one condition must be true
        ! (NOT) - reverses a condition (true = false, false = true) */

        int numa = 200;
        int numb = 33;
        int numc = 500;
        if (numa > numb && numc > numa) {
            System.out.println("Both conditions are true");
        }

        int num1 = 200;
        int num2 = 33;
        int num3 = 500;
        if (num1 > num2 || num1 > num3) {
            System.out.println("At least one condition is true");
        }

        int num4 = 33;
        int num5 = 200;
        if (!(num4 > num5)) {
            System.out.println("33 is NOT greater than 200");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;
        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }


        int myNum = 5;
        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }
    }
}
