package Basic;

public class Java15_WhileLoop {
    public static void main(String[] args) {
        //WhileLoop: repeats a block of code as long as the specified condition is true

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int countDown = 3;
        while (countDown > 0) {
            System.out.println(countDown);
            countDown--;
        }
        System.out.println("Happy New Year");

        int a = 10;
        while (a < 5) { //If condition is false, it will never run
            System.out.println("This will never be printed");
            a++;
        }


        // Do/While Loop: will execute the code block once, even the condition is false
        int c = 10;
        do {
            System.out.println(c);
            c++;
        } while (c < 5);

        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        int dice = 1;
        while ( dice <= 6) {
            if (dice < 6) {
                System.out.println("Hurree !!");
            } else {
                System.out.println("Chakka !!");
            }
            dice = dice + 1;
        }
    }
}
