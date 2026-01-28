package Basic;

public class ForLoop_12 {
    public static void main(String[] args) {
        //ForLoop: when we know exactly how many times to loop
        /*
       for (statement 1; statement 2; statement 3) {
         // code block to be executed
        }
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed. */

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for (int a = 0; a <=10; a += 2) {
            System.out.println(a);
        }

        int sum = 0;
        for (int b = 1; b <= 5; b++ ){
            sum += b;
        }
        System.out.println(sum);


        //if condition is false, it will never run
        for (int c = 10; c < 5; c++ ){
            System.out.println(c);
        }

        //Nested Loops: Loop inside a Loop
        //Outer Loop
        for ( int d = 1; d <= 2; d++ ){
            System.out.println("Outer: " + 1);

            //Inner Loop
            for (int e = 1; e <= 3; e++){
                System.out.println("inner: " + e);
            }
        }

        for ( int j = 1; j <= 3; j++) {
            for ( int k = 1; k <= 3; k++ ){
                System.out.println(j * k + " ");
            }
            System.out.println();
        }

        //For Each Loop: sed exclusively to loop through elements in an array (or other data structures)
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars){
            System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }

        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
