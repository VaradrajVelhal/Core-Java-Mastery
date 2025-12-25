
// Write a Java program to create a package ecommerce with classes Product,
//Customer,and Order.Use Javadoc comments to document the package and its classes.Generate the HTML
//documentation using the Javadoc tool.
import ecommerce.Product;
import ecommerce.Customer;
import ecommerce.Order;

/**
 * A demo class to test the ecommerce package.
 */
public class Program10 {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(101, "Laptop", 999.99);
        Product p2 = new Product(102, "Mouse", 25.50);

        // Create customer
        Customer c = new Customer(1, "Alice");

        // Create order
        Order order = new Order(5001, c);
        order.addProduct(p1);
        order.addProduct(p2);

        // Show details
        order.showOrderDetails();
    }
}