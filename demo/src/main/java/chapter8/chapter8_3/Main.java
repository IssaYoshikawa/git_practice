package chapter8.chapter8_3;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("起動完了");
        ServerSocket svSock = new ServerSocket(39648);
        Socket sock = svSock.accept();
        System.out.println(sock.getInetAddress() +"からの接続");
        sock.getOutputStream().write("WELCOME".getBytes());
        sock.getOutputStream().flush();
        sock.close();
    }
}
