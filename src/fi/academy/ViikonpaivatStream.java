package fi.academy;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ViikonpaivatStream {
    public static void main(String[] args) {
        String [] viikonpaivat = {"Maanantai", "Tiistai", "Keskiviikko", "Torstai", "Perjantai", "Lauantai", "Sunnuntai"};
        Stream<String> virtapaivat = Arrays.stream(viikonpaivat);
        String tulos = virtapaivat.map(String::toUpperCase)
                .sorted()                       // <-- luonnollinen järjestys. Jos halutaan sortattu pituuden mukaan .sorted((s1, s2) -> s1.length()-s2.length())
                .collect(Collectors.joining(" "));
        System.out.println(tulos);


    }

}
