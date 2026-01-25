package Personal;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_03_Restaurant {
    public static void main(String[] args) {
            Restaurant res = new Restaurant();
            res.addMenuItems();   // Step 1: add MOMO items
            res.showMenu();       // Step 2: display menu
            res.takeOrder();      // Step 3: take user orders
            res.printBill();      // Step 4: print bill
    }
}

class Restaurant {
    ArrayList<MenuItem> menu = new ArrayList<>();
    ArrayList<OrderItem> orders = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // 1. Add menu items
    public void addMenuItems() {
        menu.add(new MenuItem(1, "Chicken MOMO", 250.0));
        menu.add(new MenuItem(2, "Veg MOMO", 180.0));
        menu.add(new MenuItem(3, "Jhol MOMO", 280.0));
        menu.add(new MenuItem(4, "Buff MOMO", 230.0));
        menu.add(new MenuItem(5, "Pork MOMO", 220.0));
    }

    // 2. Show menu
    public void showMenu() {
        System.out.println("====Welcome to MOMO Restaurant====");
        System.out.println("   -------Menu-------");
        System.out.printf("%-20s %10s\n", "--Items--", "--Price--");
        for (MenuItem item : menu) {
            item.displayItem();
        }
    }

    // 3. Take orders from user
    public void takeOrder() {
        boolean ordering = true;
        while (ordering) {
            System.out.print("Enter item number: ");
            int sn = sc.nextInt();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            // Find MenuItem by sn
            MenuItem chosenItem = null;
            for (MenuItem item : menu) {
                if (item.sn == sn) {
                    chosenItem = item;
                    break;
                }
            }

            if (chosenItem != null) {
                orders.add(new OrderItem(chosenItem, qty));
                System.out.print("Do you want to order more? (y/n): ");
                char c = sc.next().charAt(0);
                if (c == 'n' || c == 'N') ordering = false;
            } else {
                System.out.println("Invalid item number!");
            }
        }
    }

    // 4. Print bill
    public void printBill() {
        System.out.println("\n===== Your Bill =====");
        System.out.printf("%-20s %-10s  %-10s\n", "--Items--", "--Qty--", "--Price--");
        double total = 0;
        for (OrderItem order : orders) {
            order.displayOrder();
            total += order.calculatePrice();
        }
        System.out.println("------------------------");
        System.out.printf("Total: %26.2f\n", total);
        System.out.println("Thank you for visiting MOMO Restaurant!");
    }
}


// MenuItem class
class MenuItem {
    int sn;
    String foodItems;
    double price;

    MenuItem(int sn, String foodItems, double price){
        this.sn = sn;
        this.foodItems = foodItems;
        this.price = price;
    }

    public void displayItem(){
        // %-20s -> left-align string in 20 characters
        // %10.2f -> right-align float with 2 decimal places
        System.out.printf("%-20s %10.2f\n", sn + ". " + foodItems, price);
    }
}

class OrderItem{
    MenuItem item;
    int quantity;

    OrderItem(MenuItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }
    public double calculatePrice(){
        return quantity * item.price;

    }
    public void displayOrder(){
        System.out.printf("%-20s x%-2d %10.2f\n ", item.foodItems, quantity, calculatePrice());
    }
}




