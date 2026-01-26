package Basic;

public class Array_04 {
    public static void main(String[] arg){
        int[] num1 = {1, 2, 3, 4, 5};

        printArray(num1);//Using method at End

        //Looping through an Array
        int[] num2 = {2, 4, 6, 7, 9};
        for (int i = 0; i < num2.length; i ++){
            System.out.println(num2[i]);
        }

        //enhanced for loop
        int[] num3 = {11, 22, 33, 44, 55};
        for ( int n : num3){
            System.out.println(n);
        }

        //Sum of all elements
        int[] num4 = {5, 15, 25, 35};
        int sum = 0;

        for ( int i : num4 ){
            sum += i;
        }
        System.out.println("Total Sum: " + sum );

    }
    //Array in Method
    public static void printArray(int[] arr){
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
