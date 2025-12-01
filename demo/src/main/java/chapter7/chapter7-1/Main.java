import java.io.FileReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader ft = new FileReader("rpgdata.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(ft);
        for(CSVRecord r : records){
            String name = r.get(0);
            String hp = r.get(1);
            String mp = r.get(2);
            System.out.println(name + "/" + hp + "/" + mp);
        }
        ft.close();
    }
}
