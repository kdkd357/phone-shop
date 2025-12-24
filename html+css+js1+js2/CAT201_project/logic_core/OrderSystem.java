import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    public static void main(String[] args) {
        // Step 1: Initialize products (Demonstrating OOP)
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("iPhone 17 Pro Max", 5999.0));
        cart.add(new Product("Samsung S25 Ultra", 6299.0));

        System.out.println("=== Background Java Processing Simulation ===");

        // Step 2: Calculate total price (Demonstrating Business Logic)
        double total = 0;
        for (Product p : cart) {
            System.out.println("Item: " + p.getName() + " | Price: RM" + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Price calculated by Java: RM" + total);
        System.out.println("Status: Transaction Processed Successfully.");
    }
}