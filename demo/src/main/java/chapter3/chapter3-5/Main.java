
import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account("Alice", 300));
        list.add(new Account("Bob", 150));
        list.add(new Account("Carol", 500));

        list.sort((x, y) -> Integer.compare(y.zandaka, x.zandaka));
        
        System.out.println("残高が多い順");
        for(Account acc : list){
            System.out.println(acc);
        }
    }
}