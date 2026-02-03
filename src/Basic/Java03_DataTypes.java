package Basic;

public class Java03_DataTypes {
    public static void main(String[] args) {

        //a variable in Java must be a specified data type:
        int myNum = 5;                //whole number
        float myFloatNum = 5.99f;     //7 Decimal number
        double myDoubleNum = 5.999d;  //16 Decimal number
        char myLetter = 'D';          //Only a Letter
        boolean myBool = true;        //True or False
        String myText = "Hello";      //Text
        var x = 50;
        // var detects the variable based on assign value



        //Real Life Example
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';


        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

    }
}
