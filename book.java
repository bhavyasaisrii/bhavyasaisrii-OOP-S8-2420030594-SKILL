
public class book {

    // Private attributes
    private String title;
    private String author;
    private double price;

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "----- Book Details -----\n" +
               "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Price: ₹" + price;
    }

    // Main method
    public static void main(String[] args) {
        book myBook = new book();
        myBook.setTitle("The Alchemist");
        myBook.setAuthor("Paulo Coelho");
        myBook.setPrice(499.99);

        // Printing object directly → calls toString()
        System.out.println(myBook);
    }
}
