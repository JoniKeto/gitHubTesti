package fi.academy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;





public class LukuArpoja {
    public static void main(String[]args){
    final Random rnd = new Random();
    List<Integer> numerot = IntStream
            .generate(()->rnd.nextInt(1000))
            .limit(10)
            .mapToObj(Integer::valueOf) // .boxed()
            .peek(System.out::println)
            .collect(Collectors.toList());
//tulostetaan 10 satunnaista lukua 1-999
        System.out.println(numerot);
// tulostetaan näiden kymmenen luvun summa:
        System.out.println(numerot.stream()
            .mapToInt(Integer::intValue)
            .sum());
// ja suurin arvo
        System.out.println("Suurin: " + numerot.stream()
                .mapToInt(Integer::intValue)
                .max());
// ja keskiarvo
        System.out.println("Keskiarvo: " + numerot.stream()
                .mapToInt(Integer::intValue)
                .average());
    }



}