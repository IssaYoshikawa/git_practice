package chapter8.practice8_1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("https://dokojava.jp/favicon.ico");

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream("dj.ico");

        int i;
        while((i = is.read()) != -1){
            fos.write(i);
        }

        fos.flush();
        fos.close();
        is.close();

        System.out.println("画像の保存が完了しました");
    }
}
