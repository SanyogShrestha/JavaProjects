package Basic;

public class Java14_Array {
    public static void main(String[] args) {
        //Array: To store multiple values in a single variable
        //To declare array: VariableType[] name;
        //Array index start with 0: [0]

        String[] names = {"Sanyog", "Sandesh", "Tiranzan", "Binay"};
        System.out.println(names[0]);
        names[2] = "Anil";
        System.out.println(names[2]);

        int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(myNum[3]);
        System.out.println("Total numbers are: " + myNum.length);

        String[] cars = new String[4]; // size is 4
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
        System.out.println(cars[0]);
        //Loop through Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);

        //Loop through an Array with For-Each
        for (String car : cars) {
            System.out.println(car);
        }
        //For-Each loop doesn't show position(index)

        String[] seats = {"Dad", "Mom", "Sister", "Brother"};
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        }
        // Note: The for-each loop is great when you only need to read elements.
        // If you want to change the elements later,
        // or keep track of their index, use a regular for loop instead.

        //Real Life Examples
        int ages[] = {19, 25, 29, 35, 53, 24, 36, 42};
        float avg, add = 0;
        for ( int age : ages ) {
            add += age;
        }
        avg = add / ages.length;
        System.out.println("The average is " + avg);

        int max = ages[0];
        int min = ages[0];
        for (int a : ages) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);


        //Multi-Dimension Array: contain other arrays
        int [][] myNumbers = { {1,2,3,7,8,}, {4,5,6,9} };
        System.out.println(myNumbers[1][2]);
        System.out.println(myNumbers[0][2]);
        myNumbers[1][2] = 2;
        System.out.println(myNumbers[1][2]);
        System.out.println("Rows: " + myNumbers.length);
        System.out.println("Cols in row 0: " + myNumbers[0].length);
        System.out.println("Cols in row 1: " + myNumbers[1].length);

        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }
        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}
