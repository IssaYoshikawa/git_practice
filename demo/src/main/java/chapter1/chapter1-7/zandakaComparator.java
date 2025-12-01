import java.util.Comparator;

public class zandakaComparator implements Comparator<Account> {
    public int compare(Account x, Account y){
        return Integer.compare(x.zandaka, y.zandaka);
    }
}
