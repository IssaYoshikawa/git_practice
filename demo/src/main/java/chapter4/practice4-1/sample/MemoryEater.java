package sample;

import java.util.Locale;

public class MemoryEater {
    public static void main(String[] args) {

        Locale loc = Locale.getDefault();

        if(loc.getLanguage().equals("ja")){
            System.out.println("メモリを消費しています...");
        } else {
            System.out.println("eating memory...");
        }

        long[] data = new long[12800000];
    }
}
