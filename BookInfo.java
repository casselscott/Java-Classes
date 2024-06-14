public class BookInfo {
    public static void main(String[] args) {
        // Creating objects of the Book class
        Book book1 = new Book("Children are the Leaders of Tomorrow", "Harper Lee", 1960);
        Book book2 = new Book("1984", "Learn Programming", 1999);

        // Displaying book information
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
