package Personal;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_04_Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        History history = new History();
        Calculator calc = new Calculator(history);


        while (true) {

            char choice;
            while (true) {
                System.out.println("Welcome to the Calculator!");
                System.out.println("1.Calculate 2.History 3.Exit");
                System.out.println("Enter your choice:");

                String input = sc.next();
                if (input.length() != 1 || !"123".contains(input)) {
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    continue; // ask again
                }

                choice = input.charAt(0);
                break;

            }




            double a = 0;
            while (true) {
                System.out.println("Enter first number ( or type 'exit' to quit or type 'h' for history. ): ");
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Calculation finished.");
                    return;
                }
                if (input.equalsIgnoreCase("h")) {
                    if (!history.hasHistory()){
                        System.out.println("No history yet.");
                    } else {
                    System.out.println("History: " + history.getHistory());
                    }
                    continue;
                }

                try {
                    a = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number. ");
                }
            }

            char op;
            while (true) {
                System.out.println("Enter operator ( + - * / ^ s for sqrt): ");
                String opInput = sc.next();
                if (opInput.length() == 1 && "+-*/^s".contains(opInput)){
                    op = opInput.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid operator! Please enter a valid operator. ");
                }
            }

            double b = 0;
            if (op != 's') {
                while (true) {
                    System.out.println("Enter second number: ");
                    String input2 = sc.next();
                    try {
                        b = Double.parseDouble(input2);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a valid number. ");
                    }
                }
            }

            double result = switch (op) {
                case '^' -> calc.power(a, b);
                case 's' -> calc.sqrt(a);
                default -> calc.calculates(a, b, op);
            };

            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        }
    }
}

class Calculator {
    private int usageCount = 0;
    private History history;

    Calculator(History history) {
        this.history = history;
    }

    double power(double a, double b) {
        return store(Math.pow(a, b));
    }

    double sqrt(double a) {
        return store(Math.sqrt(a));
    }

    double calculates(double a, double b, char op) {
        usageCount++;
        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (b == 0) ? Double.NaN : a / b;
            default -> Double.NaN;
        };
        if (!Double.isNaN(result)) {
            if (op == '/' && b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("Invalid operator! ");
            }
        }
        return store(result);
    }
    private double store(double result) {
        if (!Double.isNaN(result)) {
            history.addHistory(result);
        }
        return result;
    }

}

class History {
    private ArrayList<Double> history = new ArrayList<>();

    void addHistory(double result) {
        history.add(result);
    }

    ArrayList<Double> getHistory(){
        return history;
    }
    boolean hasHistory() {
        return !history.isEmpty();
    }
}




