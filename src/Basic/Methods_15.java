package Basic;

public class Methods_15 {
    //Method: A method is a block of code which only runs when it is called

    public static void main(String[] args) {
        myMethod();
        myMethod2("Aayush", 18);
        myMethod2("ReeMa ", 2036);
    }
    static void myMethod() {
        System.out.println("My nick name is Mangale.");
    }
    static void myMethod2(String fname, int age) {
        System.out.println("My Name is " + fname + " Shrestha and " + age + " years old.");
    }


}
