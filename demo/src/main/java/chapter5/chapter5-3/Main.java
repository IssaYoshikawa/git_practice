
public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setName("三井住友銀行");
        b1.setAddress("東京");

        Bank b2 = new Bank();
        b2.setName("三井住友銀行");
        b2.setAddress("東京");

        System.out.println(b1.equals(b2));
    }
    

}
