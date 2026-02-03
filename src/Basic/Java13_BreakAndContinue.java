package Basic;

public class Java13_BreakAndContinue {
    public static void main(String[] args) {
        //break: statement can also be used to jump out of a loop or switch statement.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        //continue: statement breaks one iteration (in the loop),
        // if a specified condition occurs, and continues with the next iteration in the loop.

        for (int i = 0; i <= 5; i++) {
            if (i == 4) {
                continue; //skip the value 4
            }
            System.out.println(i);
        }

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }


        //Break and Continue in While Loop:
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
            if (a == 4) {
                break;
            }
        }

        int[] numbers = {3, -1, 7, 0, 9};

        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(n);
        }
    }
}
