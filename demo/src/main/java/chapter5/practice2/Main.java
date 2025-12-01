import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java", new Date(2025, 11, 10), "いい");
        Book b2 = new Book("Java", new Date(2025, 11, 10), "だめ");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        System.out.println(bookSet.size());

        System.out.println(b1.compareTo(b2));

    };
        
}