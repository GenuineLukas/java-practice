package TimePackage;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        //print as a String.
        System.out.println(shortFormat);
        //using ofPattern()
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = myFormatter.format(LocalDate.now());
        System.out.println(myDate);
    }
}
