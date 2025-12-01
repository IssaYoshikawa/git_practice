package chapter7.chapter7_11;

import java.io.File;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class InteractiveMain {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Scanner scanner = new Scanner(System.in, "MS932");

        System.out.println("===ゲーム設定ツールを起動します");

        File sourceFile = new File("hero.json");
        JsonFileData data = mapper.readValue(sourceFile, JsonFileData.class);

        System.out.println("現在のデータ読み込み完了");
        System.out.println(" 名前：" + data.hero.name);
        System.out.println(" 武器：" + data.hero.weapon.name);
        System.out.println("---------------------------------");

        System.out.println("\nデータを変更します．新しい値を入れてください");
        System.out.println("（変更しない場合は何も書かずEnterを押してください");

        System.out.print("新しい名前 > ");
        String inputName = scanner.nextLine();

        System.out.print("新しい武器 > ");
        String inputWeapon = scanner.nextLine();

        if(!inputName.isEmpty()){
            System.out.println(">> 名前を '" + inputName + "' に変更しました");
            data.hero.name = inputName;
        }

        if(!inputWeapon.isEmpty()){
            System.out.println(">> 武器を '" + inputWeapon + "' に変更しました");
            data.hero.weapon.name = inputWeapon;
        }

        scanner.close();

        System.out.println("\n===最終的なJSONデータ===");

        String jsonResult = mapper.writeValueAsString(data);
        System.out.println(jsonResult);

        mapper.writeValue(new File("hero_updated.json"), data);
        System.out.println("\n>> 'hero_updated.json' に保存しました");


    }
}
