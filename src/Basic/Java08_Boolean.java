package Basic;

public class Java08_Boolean {
    public static void main(String[] args) {
        //boolean store true and false values
        boolean abc = true;
        boolean acb = false;
        System.out.println(abc);
        System.out.println(acb);

        System.out.println(10 > 9);
        System.out.println(10 < 9);

        int x = 10;
        System.out.println(x == 10);

        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }


    }
}
