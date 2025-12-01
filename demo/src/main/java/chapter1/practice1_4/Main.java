
import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster("お化けきのこ", 10, false));
        monsters.add(new Monster("ゴブリン", 25, false));
        monsters.add(new Monster("ドラゴン", 120, true));

        for(Monster m : monsters){
            System.out.println(m);
        }
    }
}
