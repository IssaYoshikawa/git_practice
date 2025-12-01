
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("佐藤健太");
        names.add("鈴木さくら");
        names.add("高橋蓮");
        names.add("田中美咲");

        List<String> lengthp = names.stream()
            .filter(name -> name.length() == 4)
            .map(name -> name + "さん")
            .collect(Collectors.toList());

        System.out.println(lengthp);

    }

    
    
}
