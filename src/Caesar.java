
//package fi.academy;
//
//import java.util.stream.Stream
//import java.util.Arrays
//import java.util.*
//import java.util.Collections
//
//
//public static void main(String[]args){
//    yksiMerkkijono();
//}
//
//    Scanner lukija = new Scanner(System.in);
//    String sana = lukija.nextLine();
//
//
//
//    private static String salaa(String sana) {
//        char [] sana_arr= sana.toCharArray();
//        for ( int i = 0; i < sana_arr.length; i++) {
//            sana_arr[i] += 3;
//        }
//        return new String (sana_arr);
//    }

//private static void yksiMerkkijono() {
//        String mjono="merkkijono";
//        System.out.println(salaa(mjono));
//        }
//

// Omaa kokeilua...

//import java.nio.charset.Charset;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Caesar {
//    public static void main(String[] args) {
//        Scanner lukija = new Scanner(System.in);
//
//        String aakkoset = "abcdefghijklmnopqrstuvwxyz";
//        String aakkosetPlusKolme= "defghijklmnopqrstuvwxyzabc";
//        String aakkosetKirjaimina =
//
//        System.out.println(aakkosetKirjaimina);
//
//        Map<Charset, String> kartta = new HashMap<>();
//
//       // List<String> aakkosetLista = new Arrays.asList(aakkoset);
//        //List<String> aakkosetPlusKolmeLista= new ArrayList;
//
////        for (int i = 0; i < aakkoset.length(); ) {
////            kartta.put(aakkoset.charAt(i), aakkosetPlusKolme.charAt(i));
////            i++;
////        }
////
////        System.out.println("Anna salattava sana: ");
////        String salattava = lukija.nextLine();
////        Stream salattavaKirjaimet = (Stream) salattava.chars();
////        int indx = 0;
////
////
////
////        for (int i = 0; i < salattava.length() ; i++) {
////            salattavaKirjaimet.equals(kartta.get(i))= int uusiIndex;
////            aakkosetPlusKolme.getChars(uusiIndex,i, kartta, i);
////            System.out.print(kartta.get(uusiIndex));
////
////
////        }
//
//
////        String sekotettu= abc.mapToObj(i -> "" +(char)i)
////                .forEach()
////
////                .collect(Collectors.joining(" "));
////
////        System.out.println(sekotettu);
//
////        public static String salaa(){
////        Stream salattu = salattava.chars();
////            String salattuSana = salattu.mapToObj(i-> " "+ (i+3));
////            return salattuSana;
////
////
////        }
//
//    }
//
//}
