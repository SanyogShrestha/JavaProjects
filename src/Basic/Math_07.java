package Basic;

public class Math_07 {
    public static void main(String[] args) {
        //The Java Math class has many methods that allows to perform mathematical tasks on numbers.

        System.out.println(Math.max(25, 35));
        System.out.println(Math.min(27, 37));
        System.out.println(Math.sqrt(65));
        System.out.println(Math.abs(-22.24));
        System.out.println(Math.pow(5,4)); // 5 multiplied by itself 4 times.
        System.out.println(Math.random()); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println((Math.random() * 101)); // 0 - 100
        //returns a double. To get an integer,we need to cast it with (int).
        System.out.println((int) (Math.random() * 101));

    }
}
