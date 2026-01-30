package Basic;

public class Methods_15 {
    //Method: A method is a block of code which only runs when it is called
    // void: indicates that method should not return a value
    static void myMethod() {
        System.out.println("My nick name is Mangale.");
    }

    static void myMethod2(String fname, int age) {
        System.out.println("My Name is " + fname + " Shrestha and " + age + " years old.");
    } // here String fname and int age is Parameters and Aayush and Reema is Arguments
    // must have same number of argument as there are parameters in the same order

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are just child!");
        } else {
            System.out.println("You are adult! Earn some money!");
        }
    }



    // Return Values
    static int myMehthod3(int x, int y) {
        return x * y;
    }


    //Method Overloading: multiple methods can have the same name with different parameters
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    //Recursion: Recursion is the technique of making a function call itself
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }



    public static void main(String[] args) {
        myMethod();
        myMethod2("Aayush", 18);
        myMethod2("ReeMa ", 26);
        checkAge(17);
        System.out.println(myMehthod3(20, 30));
        int a = myMehthod3(6, 4);
        System.out.println(a);
        System.out.println(plusMethod(10, 20));
        System.out.println(plusMethod(5.55, 12.6));

        //Scope: variables are only accessible inside the region where they are created
        //Block Scope: code between curly braces{}

        //Code here cannot use x
        { // block start
        // Code here cannot use x
        int x = 100;
        //Code here can use x
        System.out.println(x);
        } //block end
        // Code here cannot use x

        //Loop Scope: Variables declared inside a for loop only exist inside the loop
        // So same variable name can reuse in different loops in the same method
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop 1: " + i);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop 2: " + i);
        }

        int result = sum(10);
        System.out.println(result);
    }
}