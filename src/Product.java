import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class Product {
    String pname;
    String ptype;
    int pID;
    String Pdate;
    Receiver receiver;

    public Product() {
    }

    public Product(String pname, String ptype, int pID, Receiver receiver) {
        Date getdate = Calendar.getInstance().getTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.Pdate = formatter.format(now);
        this.pname = pname;
        this.ptype = ptype;
        this.pID = pID;
        this.receiver = receiver;
    }
}
