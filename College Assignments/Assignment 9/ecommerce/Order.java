package ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an order placed by a customer.
 * Contains a list of products and handles total calculation.
 * * @author Student
 * 
 * @version 1.0
 */
public class Order {
    /** The unique order ID. */
    private int orderId;

    /** The customer who placed the order. */
    private Customer customer;

    /** The list of products in this order. */
    private List<Product> products;

    /**
     * Creates a new Order for a specific customer.
     * * @param orderId The unique order ID.
     * 
     * @param customer The customer placing the order.
     */
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the order.
     * * @param product The product object to add.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Calculates the total cost of all products in the order.
     * * @return The total cost.
     */
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    /**
     * Displays the order summary to the console.
     */
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products: " + products);
        System.out.println("Total: $" + calculateTotal());
    }
}