import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setName("三井住友銀行");
        b1.setAddress("東京");

        Bank b2 = new Bank();
        b2.setName("三井住友銀行");
        b2.setAddress("東京");

        Bank b3 = new Bank();
        b3.setName("みずほ銀行");
        b3.setAddress("丸の内");

        System.out.println("b1のハッシュコード：" + b1.hashCode());
        System.out.println("b2のハッシュコード：" + b2.hashCode());
        System.out.println("b3のハッシュコード：" + b3.hashCode());

        System.out.println("b1.equals(b2) ? :" + b1.equals(b2));
        System.out.println("b1.hashCode() == b2.hashCode() ? : " + (b1.hashCode() == b2.hashCode()));

        System.out.println("HashSetでの動作");
        Set<Bank> bankSet = new HashSet<>();
        bankSet.add(b1);
        bankSet.add(b2);
        bankSet.add(b3);

        System.out.println("HashSet内の要素数：" + bankSet.size());
    }

}
