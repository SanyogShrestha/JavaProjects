package Personal;
import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");


        System.out.println("Hello World ! ");

        int age = 20;
        double price = 99.99;
        boolean isJavaFun = true;
        char grade = 'A';
        String myName = "Sanyog";

        System.out.println("Name: " + myName + ",Age: " + age);
        System.out.println("The cost of that copy is Rs " + price + ".");

        int number = 10;
        if (number > 0 ){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }
}// test
