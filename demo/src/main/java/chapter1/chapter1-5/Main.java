
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<Hero> list = new HashSet<>();
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        list.add(h1);

        Hero h2 = new Hero();
        h2.name = "ミナト";
        h2.hp = 100;
        list.remove(h2);

        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h1.equals(h2));
        System.out.println("要素数：" + list.size());
    }
}
