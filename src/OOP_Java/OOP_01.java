package OOP_Java;

public class OOP_01 {
    int x = 5;
    int y;
    //OOP: writing method that perform operation on the data.
    //a class is a template for objects, and an object is an instance of a class.
    public static void main(String[] args) {
        OOP_01 myObj = new OOP_01(); //Object 1
        OOP_01 myObj2 = new OOP_01(); //Object 2
        System.out.println(myObj.x);
        myObj2.y = 25;
        System.out.println(myObj2.y);
    }
}
