package chapter8.chapter8_2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Main {
    public static void main(String[] args) throws IOException {

        SSLSocketFactory factory = (SSLSocketFactory)SSLSocketFactory.getDefault();

        SSLSocket sock = (SSLSocket)factory.createSocket("dokojava.jp", 443);

        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        os.write("GET /index.html HTTP/1.0\r\n".getBytes());
        os.write("Host: dokojava.jp\r\n".getBytes());
        os.write("\r\n".getBytes());
        os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1){
            System.out.print((char) i);
            i = isr.read();
        }
        sock.close();

    }
}
