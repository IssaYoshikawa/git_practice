
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;



public class Main{
    public static void main(String[] args) {
        Locale loc = Locale.US;
        System.out.println(loc.getCountry() + "-" + loc.getLanguage());

        

        if(loc.getLanguage().equals("ja")){
            SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy h:mm a", loc);
            String now = sdf.format(new Date());
            System.out.println("現在の時刻は" + now);

        } else if (loc.getLanguage().equals("en")) {
            SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy h:mm a", loc);
            sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
            String now = sdf.format(new Date());
            
            System.out.println("Current time is " + now);
        }
    }
}