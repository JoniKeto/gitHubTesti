package fi.academy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static javax.swing.UIManager.get;


public abstract class Paivamaara {


    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar paiva = new GregorianCalendar(2018, Calendar.APRIL, 13);
        System.out.println(paiva);

        String viikonpaiva = paiva.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("fi"));
        System.out.println(viikonpaiva);

        // Tänään ja lisätään kolmen päivän päästä

        Calendar tanaan=Calendar.getInstance();
        tanaan.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(tanaan.getTime());



    }
}
