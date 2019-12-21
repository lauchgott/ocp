package wbs.stream.basic;// welche ausgabe erzeugt der folgende code?
// bitte d e t a i l l i e r t e analyse!

import java.util.Arrays;

public class FlatMapDemo {

        public static void main(String[] args) {
                
                String[] sa = { "eins und eins ist zwei", "anna und hanna",
                                "anna und manna und undine" };
                
                long n = Arrays.stream(sa).map(s -> s.split(" "))
                                .flatMap(s -> Arrays.stream(s)).distinct()
                                .map(s -> s.toUpperCase()).sorted().peek(System.out::println)
                                .count();
                
                System.out.println(n);
        };
}
/*
Christian: Arrays.stream(sa) -> sa ist ein StringArray und wird mit der Stream-Methode zu einem Stream von Strings gemacht.
map -> Function als übergabeparameter --> liefert ein Array von String

flatMap - hat die Function als Parameter --> liefert einen Stream von String. distinct()-Methode macht aus allen Streams
einen Stream.

die map nach der FlatMap liefert ein Stream von StringArrays.
 */