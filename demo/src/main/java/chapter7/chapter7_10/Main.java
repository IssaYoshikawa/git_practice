package chapter7.chapter7_10;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Java\\demo\\src\\main\\java\\chapter7\\chapter7_10\\hero.json"));
        JsonNode hero = root.get("hero");
        JsonNode weapon = hero.get("weapon");
        System.out.println("名前：" + hero.get("name").textValue());
        System.out.println("武器：" + weapon.get("name").textValue());
    }
}
