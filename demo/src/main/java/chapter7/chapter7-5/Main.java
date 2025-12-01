
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;





public class Main {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        File file = new File("rpgdata.properties");
        if(file.exists()){
            try(Reader fr = new InputStreamReader(new FileInputStream(file), "UTF-8")){
                p.load(fr);
            }
        }

        p.setProperty("heroName", "アサカ");
        p.setProperty("heroHp", "62");
        p.setProperty("heroMp", "45");

        try(Writer fw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8")){
            p.store(fw, "勇者の情報（追加・更新済み）");
        }

        System.out.println("プロパティを更新しました");
    }
}
