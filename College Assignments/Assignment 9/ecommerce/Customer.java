package ecommerce;

/**
 * Represents a customer in the ecommerce system.
 * * @author Student
 * 
 * @version 1.0
 */
public class Customer {
    /** The unique ID of the customer. */
    private int customerId;

    /** The full name of the customer. */
    private String name;

    /**
     * Creates a new Customer.
     * * @param customerId The unique customer ID.
     * 
     * @param name The full name of the customer.
     */
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    /**
     * Gets the customer's name.
     * * @return The name of the customer.
     */
    public String getName() {
        return name;
    }
}