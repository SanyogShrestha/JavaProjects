package Basic;

public class Java04_TypeCasting {
    public static void main(String[] args) {

        //Type casting means converting one data type into another

        //Widening casting
        int x = 15;
        double y = x; // Automatic casting: int to double
        System.out.println(x);
        System.out.println(y);

        double a = 5.55d;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);

        //Real Life Example
        int fullMarks = 75;
        int actualMarks = 66;
        double percentage = (double) actualMarks / fullMarks * 100.0d;
        System.out.println( "Percentage is: " + percentage + "%");
    }
}
