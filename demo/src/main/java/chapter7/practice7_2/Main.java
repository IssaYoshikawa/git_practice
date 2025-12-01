package chapter7.practice7_2;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args){
        ResourceBundle bundle = ResourceBundle.getBundle("pref");

        String capital = bundle.getString("aichi.capital");
        String food = bundle.getString("aichi.food");

        System.out.println(capital + " : " + food);
    }
}
