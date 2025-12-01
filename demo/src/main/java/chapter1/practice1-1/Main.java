import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        List<Book> books = new ArrayList<>();
        
        books.add(new Book("Java入門", f.parse("2011/10/07"), "すっきりわかる"));
        books.add(new Book("Python入門", f.parse("2019/06/11"), "カレーが食べたくなる"));
        books.add(new Book("C言語入門", f.parse("2018/06/21"), "ポインタも自由自在"));


        System.out.println("ソート前:");
        for (Book b : books) {
            System.out.println(b);
        }

        Collections.sort(books, new TitleComparator());

        System.out.println("\nタイトル昇順ソート後:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
