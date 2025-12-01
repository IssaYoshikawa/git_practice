
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // String msg = "第一土曜日は資源ごみの日です";
        // Reader sr = new StringReader(msg);
        // System.out.print((char)sr.read());
        // System.out.println((char)sr.read());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(66);
        byte[] data = baos.toByteArray();
        for(byte b : data){
            System.out.println((char)b);
        }
    }
}
