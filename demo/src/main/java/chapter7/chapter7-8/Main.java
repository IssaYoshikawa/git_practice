
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


public class Main {
    public static void main(String[] args) throws Exception {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getCountry() + "-" + loc.getLanguage());
        String now = (new SimpleDateFormat()).format(new Date());
        ResourceBundle rb = ResourceBundle.getBundle("messages", loc);
        System.out.println(rb.getString("CURRENT_TIME_IS") + now);
    }
}
