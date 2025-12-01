package chapter8.chapter8_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://Google.com");

        InputStream is = url.openStream();
        try (InputStreamReader isr = new InputStreamReader(is)) {
            int i = isr.read();
            while(i != -1){
                System.err.print((char) i);
                i = isr.read();
            }
        }

    }
}
