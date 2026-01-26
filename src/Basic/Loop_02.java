package Basic;

import java.util.Scanner;

public class Loop_02 {
    public static void main(String[] args)
    {
        //For Loop
        int sum = 0;
        for(int i = 1; i <= 10; i ++) {
            System.out.println("Number: " + i);
            sum += i;
        }
        System.out.println("Total sum: " + sum);

        int sum1 = 0;
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println("Even Numbers: " + i);
                sum1 += i;
            }
        }
        System.out.println("Sum of all Even Numbers: " + sum1 );

        //While Loop
        int i = 1;
        int sum2 = 0;
        while(i <= 5 ){
            System.out.println("Number: " + i);
            sum2 += i;
            i++;
        }
        System.out.println("Total Sum: " + sum2);



        // Making games using DoWhile loop:
        int secret = 7;
        int guess;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Guess the number between 1-10 : ");
            guess = sc.nextInt();
        } while(guess != secret);

        System.out.println("Correct !");


    }
}

