package OnlineOrderSystem;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== WELCOME TO ONLINE ORDER SYSTEM ===");

        System.out.print("\nEnter How Many Orders: ");
        int n = sc.nextInt();

        MenuItem[] order = new MenuItem[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nWHAT WOULD YOU LIKE TO ORDER?");
            System.out.println("1. FOOD");
            System.out.println("2. DRINK");

            System.out.print("Enter Choice: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Name of Product: ");
            String name = sc.nextLine();

            System.out.print("Price of Product: ");
            double price = sc.nextDouble();

            if (type == 1) {

                System.out.print("Quantity of Order: ");
                int quantity = sc.nextInt();

                order[i] = new FoodItem(name, price, quantity);

            } else if (type == 2) {

                System.out.println("\nDrink Sizes:");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");

                System.out.print("Enter Size: ");
                int size = sc.nextInt();

                order[i] = new DrinkItem(name, price, size);

            } else {

                System.out.println("Invalid Input!");
            }
        }
        System.out.println("\n======= RECEIPT =======");

        double grandTotal = 0;

        for (MenuItem item : order) {

            if (item != null) {

                System.out.println("\nProduct Name: " + item.getName());
                System.out.println("Base Price: " + item.getPrice());
                System.out.println("Total Price: " + item.getTotalPrice());

                grandTotal += item.getTotalPrice();
            }
        }

        System.out.println("\nGrand Total: " + grandTotal);
    }
}