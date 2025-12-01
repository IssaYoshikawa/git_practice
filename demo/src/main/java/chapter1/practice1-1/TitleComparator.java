
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class TitleComparator implements Comparator<Book>{
    private final Collator collator;

    public TitleComparator(){
        collator = Collator.getInstance(Locale.JAPANESE);
        collator.setStrength(Collator.TERTIARY);
    }

    public int compare(Book x, Book y){
        return collator.compare(x.getTitle(), y.getTitle());
    }
}
