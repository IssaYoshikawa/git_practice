package chapter7.practice7_3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee tanaka = new Employee("田中太郎", 41);

        Department soumu = new Department("総務部", tanaka);

        FileOutputStream fos = new FileOutputStream("company.json");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(soumu);

        oos.flush();
        oos.close();
        fos.close();

        System.out.printf("総務部のオブジェクト構造をcompany.datに保存しました");
    }
}
