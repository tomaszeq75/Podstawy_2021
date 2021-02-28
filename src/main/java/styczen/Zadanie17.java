package styczen;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadanie17 {

    Scanner in = new Scanner(System.in);
    LocalDate meetingDate;
    LocalDate currentDate = LocalDate.now();

    public Zadanie17() {
        System.out.println("Podaj datę w formacie yyyy-mm-dd");
        String dateString = in.nextLine();
        meetingDate = LocalDate.parse(dateString);

        // tylko końcówka dni
        Period period = Period.between(currentDate, meetingDate);
        System.out.println("Do zajęć pozostało " + period.getDays() +  " dni");

        // w dniach
        long daysBetween = ChronoUnit.DAYS.between(currentDate, meetingDate);
        System.out.println("Do zajęć pozostało " + daysBetween +  " dni");
    }
}
