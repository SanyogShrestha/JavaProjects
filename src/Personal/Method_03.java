package Personal;

public class Method_03 {

    public static void main(String[] args) {

        greet();

        greetPerson("Sanyog");
        greetPerson("Mangale");

        int result = add(12, 13);
        System.out.println("Sum: " + result);

        printNumber();

    }
    //Simple Greeting Method
    public static void greet(){
        System.out.println("Hello User! We are learning Method.");
    }

    //Method With Parameters
    public static void greetPerson(String name){
        System.out.println("Hello " + name + "!");
    }

    //Method with Return Value
    public static int add(int a, int b){
        return a + b;
    }

    //Method to print number 1-10 using loops
    public static void printNumber(){
        for ( int i = 1; i <= 10; i ++){
            System.out.println(i);
        }
    }


}
