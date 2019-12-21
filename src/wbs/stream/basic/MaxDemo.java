package wbs.stream.basic;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/*
Wir erzeugen einen Stream und filtern einige Elemente aus (filter()).
Dann rufen wir die Methode max auf und geben das Maximum aus.

Wir stellen sicher, dass zur CompileTime nicht bekannt ist, ob der Filter Elememnte des Streams matcht oder nicht
 */
public class MaxDemo {

    public static void main(String[] args) {

//        Optional<String> stringMax = Stream.generate(() -> Math.random() > 0.9 ? new String("Bierwurst") : new String(null)).max(Comparator.naturalOrder());

        Optional<Double> max = Stream.generate(() -> Math.random()).limit(10)
                .filter(x -> x > 0.95).max(Comparator.naturalOrder());

        System.out.println(max.isPresent() ? max.get() : "no matches...");


//        System.out.println(max.get()); << dieser Code würde eine NoSuchElementException schmeißen, wenn Optional leer wäre. keine gute Idee.

    }

}
