package chapter8.chapter8_3;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket sock = new Socket("localhost", 39648);
        System.out.println("サーバーに接続しました");

        InputStream is = sock.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

        StringBuffer sb = new StringBuffer();
        int i;
        while ((i = isr.read()) != -1) {
            sb.append((char )i);
        }
        String result = sb.toString();
        System.out.println("受信データ：" + result);

        sock.close();


    }
}
