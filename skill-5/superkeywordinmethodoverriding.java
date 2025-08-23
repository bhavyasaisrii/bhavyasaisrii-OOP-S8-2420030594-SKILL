package lab5;

// Base class
class Order {
    String orderId = "ORD123";
    String customerName = "John Doe";

    public void printDetails() {
        System.out.println("----- Order Details -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
    }
}

// Subclass
class OnlineOrder extends Order {
    String deliveryAddress = "221B Baker Street, London";

    @Override
    public void printDetails() {
        // Call parent class method
        super.printDetails();
        // Add subclass-specific details
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}

public class superkeywordinmethodoverriding {

    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.printDetails(); // Calls overridden method
    }
}
