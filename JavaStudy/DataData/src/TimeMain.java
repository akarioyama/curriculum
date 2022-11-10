import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeMain {

    public static void main(String[] args) {
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow.toString());

        OffsetDateTime odtNow = OffsetDateTime.now();
        System.out.println(odtNow.toString());

        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(zdtNow.toString());
    }
}