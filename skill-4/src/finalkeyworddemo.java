
public class finalkeyworddemo {

    // Blank final variable
    private final int orderId;

    // Constructor initializes blank final variable
    public finalkeyworddemo(int id) {
        this.orderId = id;
    }

    // Final method
    public final void showMessage() {
        System.out.println("This is a final method. Order ID: " + orderId);
    }

    public static void main(String[] args) {
        // Object creation
        finalkeyworddemo obj = new finalkeyworddemo(101);
        obj.showMessage();

        // Final reference variable
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original content: " + sb);

        // Modifying content is allowed
        sb.append(" World!");
        System.out.println("Modified content: " + sb);

        // Reassigning reference is NOT allowed (will cause error if uncommented)
        // sb = new StringBuilder("New Object");
    }
}
