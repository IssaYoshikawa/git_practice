package chapter7.chapter7_11;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        //見やすい形式で（改行・インデント付き）で出力する設定をONにする
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //2. 読み込み
        JsonFileData fileData = mapper.readValue(new File("hero.json"), JsonFileData.class);

        System.out.println("変更前");
        System.out.println("名前：" + fileData.hero.name);
        System.out.println("武器：" + fileData.hero.weapon.name);
        System.out.println("HP：" + fileData.hero.hp);

        //3. データの変更
        System.out.println("\n>> レベルアップ！武器を変更しました");

        //データの追加・変更
        fileData.hero.weapon.element = "Fire";

        fileData.hero.items = new ArrayList<>();
        fileData.hero.items.add("薬草");
        fileData.hero.items.add("魔法のカギ");
        fileData.hero.items.add("世界樹の葉");

        //4. 書き出し
        mapper.writeValue(new File("hero_new.json"), fileData);

        //コンソールにもJson形式で表示してみる
        String jsonString = mapper.writeValueAsString(fileData);
        System.out.println("---保存されたデータ---");
        System.out.println(jsonString);


    }
}
