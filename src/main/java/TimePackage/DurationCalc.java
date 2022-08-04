package TimePackage;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DurationCalc {
    public static void main(String[] args) {
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String myDate = newFormatter.format(LocalDate.now());
        System.out.println(myDate);

        //getting a period using "between."
        LocalDate today = LocalDate.now();
        LocalDate birthday  = LocalDate.of(2003, 02, 13);
        Period period = Period.between(birthday, today);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        //getting the same period using "until."
        LocalDate birthDate = LocalDate.parse("2003-02-13");
        LocalDate currDate = LocalDate.now();

        System.out.println("Period in Year: " + birthDate.until(currDate, ChronoUnit.YEARS));
        System.out.println("Period in Month: " + birthDate.until(currDate, ChronoUnit.MONTHS));
        System.out.println("Period in Day: " + birthDate.until(currDate, ChronoUnit.DAYS));
    }
}
