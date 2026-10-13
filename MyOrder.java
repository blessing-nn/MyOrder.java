import java.util.Scanner;

public class MyOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Pizza: $12");
        System.out.println("2. Sandwich: $8");
        System.out.println("3. Burger: $10");

        System.out.print("Please enter your order (1-3): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            scanner.close();
            return;
        }

        int nInput = scanner.nextInt();

        if (nInput < 1 || nInput > 3) {
            System.out.println("Invalid menu option. Please enter a number between 1 and 3.");
            scanner.close();
            return;
        }

        int nPrice = 0;

        if (nInput == 1) {
            nPrice = 12;
            System.out.println("You choose the Pizza. Thank you for your order. Total cost: $" + nPrice);
        } else if (nInput == 2) {
            nPrice = 8;
            System.out.println("You choose the Sandwich. Thank you for your order. Total cost: $" + nPrice);
        } else if (nInput == 3) {
            nPrice = 10;
            System.out.println("You choose the Burger. Thank you for your order. Total cost: $" + nPrice);
        }

        scanner.close();
    }
}
