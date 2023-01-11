public class Book {
    String author = "Jules Verne";

    String title = "Ocolul pamantului in optzeci de zile";

    double price = 50.00;

    public double getPrice() {
        return price;
    }

    public String showAuthorandTitle() {
        return ("Book" + title + "is written by" + author);
    }
}
