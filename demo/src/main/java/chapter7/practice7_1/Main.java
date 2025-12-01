package chapter7.practice7_1;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("pref.properties");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        Properties pro = new Properties();
        pro.load(isr);
        fis.close();

        String capital = pro.getProperty("aichi.capital");
        String food = pro.getProperty("aichi.food");

        System.out.println(capital + " : " + food);
        
    }
}
