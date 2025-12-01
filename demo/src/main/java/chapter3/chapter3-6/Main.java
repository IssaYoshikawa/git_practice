import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Alice", 100));
        heroes.add(new Hero("Bob", 0));
        heroes.add(new Hero("Carol", 20));
        heroes.add(new Hero("Mike", 0));
        heroes.add(new Hero("Amanda", 0));


        heroes.stream().forEach(h -> {
            System.out.println("勇者" + h.name);
        });

        boolean anyoneknockedOut = heroes.stream().anyMatch(h -> h.hp == 0);
        if(anyoneknockedOut){
            System.out.println("誰かが倒れています");
        } else {
            System.out.println("全員戦えます");
        }

        heroes.stream()
            .max(Comparator.comparingInt(h -> h.hp))
            .ifPresent(h -> System.out.println("最大HPの勇者は" + h.name));

        List<String> knockedOutNames = heroes.stream()
            .filter(h -> h.hp == 0)
            .limit(3)
            .map(h -> h.name)
            .collect(Collectors.toList());

        for(String name : knockedOutNames){
            System.out.println(name);
        }

        
    }
}
