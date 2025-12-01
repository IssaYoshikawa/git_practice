package chapter7.chapter7_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("ミナト", 75, 18);
        Sword sword = new Sword("鋼の剣", 15);

        //1. インスタンスの直列化と保存
        FileOutputStream fos = new FileOutputStream("rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);
        oos.writeObject(sword);
        oos.flush();
        oos.close();

        //2. ファイルからインスタンスを復元
        FileInputStream fis = new FileInputStream("rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero)ois.readObject();
        Sword sword2 = (Sword)ois.readObject();
        System.out.println(hero2.toString());
        System.out.println(sword2.toString());
        ois.close();
    }
}
