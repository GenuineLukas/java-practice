package TimePackage;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //printing my current local date, time, or both.
        System.out.println("Now usage");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        ////printing certain date, time, or both that I want.
        System.out.println("of() usage");
        LocalDate dateOf = LocalDate.of(2022, 02, 13);
        LocalTime timeOf = LocalTime.of(20,50, 0 );

        System.out.println(dateOf);
        System.out.println(timeOf);
        
         //printing current date and time in the form of "Year/Month/Day Hour/Min"
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h/mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("Current Time: " + now);
    }
}
