package fi.academy;



import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import static java.time.temporal.ChronoUnit.DAYS;
public class Java8Paivamaara {
public static void main(String[]args){



    LocalDate tanaan = LocalDate.now();
    LocalDate valmis = LocalDate.of(2018, Month.APRIL, 13);
    LocalDate kahdenKkPaasta= tanaan.plusMonths(2);
    DayOfWeek apu = kahdenKkPaasta.getDayOfWeek();
    LocalDate ekaPE = LocalDate.of(2019, Month.JANUARY, 24);
    //LocalDate kolmasTPer= tanaan.with(TemporalAdjuster. (DayOfWeek.FRIDAY)));
    LocalDate seurSynt = LocalDate.of(2019, Month.JANUARY, 4);
    Period p = Period.between(tanaan, seurSynt);
    long p2 = DAYS.between(tanaan, seurSynt);




    System.out.println(tanaan);
    System.out.println(valmis);
    System.out.println(apu);
    System.out.printf("first Friday of Year: %s%n",
            ekaPE.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)));
    System.out.println(p);
    System.out.println(p2);



}


    }


