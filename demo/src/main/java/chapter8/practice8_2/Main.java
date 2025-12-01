package chapter8.practice8_2;

import java.io.OutputStream;
import java.net.Socket;

public class Main{
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("smtp.example.com", 60025);
        OutputStream os = sock.getOutputStream();

        String[] commands = {
            "HELO smtp.example.com\r\n",
            "MAIL FROM: asaka@example.com\r\n",
            "RCPT TO: minato@example.com\r\n",
            "DATA\r\n",
            "From: asaka@example.com\r\n",
            "Subject: Please send me your RPG\r\n",
            "Hello minato. I would like to play your RPG.\r\n",
            "Could you please send it to me ?\r\n",
            ".\r\n",
            "QUIT\r\n"
        };

        for(String command : commands){
            os.write(command.getBytes());
        }

        os.flush();
        os.close();
    }
    
}
