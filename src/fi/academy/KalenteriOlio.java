package fi.academy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KalenteriOlio {
    static GregorianCalendar kalenteri = new GregorianCalendar();

    public static void main(String[] args) {
        kalenteri.set(2018, 0,29);
        System.out.println(kalenteri);
        kalenteri.add(Calendar.MONTH, 1);
//        Calendar uusi= Calendar.get(kalenteri);
//        System.out.println(uusi);




    }
}
