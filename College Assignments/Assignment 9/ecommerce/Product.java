package ecommerce;

/**
 * Represents a product available for purchase in the store.
 * * @author Student
 * 
 * @version 1.0
 */
public class Product {
    /** The unique identifier for the product. */
    private int productId;

    /** The name of the product. */
    private String name;

    /** The price of the product in USD. */
    private double price;

    /**
     * Constructs a new Product with the specified details.
     * * @param productId The unique ID.
     * 
     * @param name  The name of the product.
     * @param price The price of the product.
     */
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the price of the product.
     * * @return The price as a double.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the product.
     * * @return A string containing the name and price.
     */
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}