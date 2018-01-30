package fi.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




public class MitaKoodiTekee {
    public static void main(String[] args) throws IOException {


    Path main = Paths.get("./src").resolve("fi.academy").resolve("MitaKoodiTekee.java");
    Map<String, Long> kaikki = Files.lines(main)
            .map(rivi -> rivi.split("[\\s\\p{Punct}]+")) // Stream<String[]>
            .flatMap(Arrays::stream) // Stream<String>
            .filter(s -> !s.isEmpty()) // tyhjät rivit pois
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
kaikki.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .forEachOrdered(e -> System.out.println(String.format("%2$4d: %1$s",
            e.getKey(), e.getValue())));
    }
}
