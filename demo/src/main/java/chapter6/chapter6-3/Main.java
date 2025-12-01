
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
        fos.write(65);
        fos.flush();
        fos.close();
    }
}
