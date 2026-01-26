package Basic;

public class OOP_05 {
    public static void main(String[] args) {

        //Create Object of Car
        Car myCar = new Car("Red", "BMW", "5 million");
        myCar.displayDetails();

        Car yourCar = new Car("Blue", "Honda", "2 million");
        yourCar.displayDetails();
    }
}
// Class blueprint
class Car {
    //Attributes (fields)
    String color;
    String brand;
    String price;

    //Constructor
    public Car(String color, String brand, String price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    //Method
    public void displayDetails() {
        System.out.println("Car Brand: " + brand + ". Car Color: " + color + ". Car Price: " + price );

    }
}
