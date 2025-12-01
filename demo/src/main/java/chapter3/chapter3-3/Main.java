import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Set<Hero> party = new HashSet<>();
        Hero leader = new Hero("Aris");
        party.add(leader);
        party.add(new Hero("bob"));
        party.add(new Hero("carol"));

        PartlyInfoConsymer showInfo = (p, l, name) -> {
            System.out.println("=== パーティ情報 ===");
            System.out.println("名前: " + name);
            System.out.println("リーダー: " + l.getName());
            System.out.println("メンバー一覧:");
            for(Hero h : p){
                System.out.println("-" + h.getName());
            }
        };

        showInfo.prosess(party, leader, "yushanokai");
    }
}
