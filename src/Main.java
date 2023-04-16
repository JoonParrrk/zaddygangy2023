import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Moe");

        System.out.println(Calender.CurrentDateTime());

        Date dNow = new Date( );
        System.out.println("Current Date: " + dNow);

    }
}