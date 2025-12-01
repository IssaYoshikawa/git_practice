import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(2, 1000));
        accounts.add(new Account(3, 2000 ));
        accounts.add(new Account(1, 5000));

        Collections.sort(accounts);
        for(Account a : accounts){
            System.out.println(a);
        }

        Collections.sort(accounts, new zandakaComparator());
        for(Account a : accounts){
            System.out.println(a);
        }
    }
}
