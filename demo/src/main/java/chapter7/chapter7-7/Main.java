
import java.util.ResourceBundle;


public class Main {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
            "rpgdata");
        String heroName = rb.getString("heroName");
        System.out.println("勇者の名前：" + heroName);
        
    }
}
