package wbs.stream.basic;

import wbs.basics.Figur2D;
import wbs.basics.Kreis;
import wbs.basics.Rechteck;
import wbs.util.LottoUtil;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IterateAndGenerateDemo {

    public static void main(String[] args) {
        Stream.iterate(1000, n -> n + 1).filter(n -> Integer.bitCount(n) == 5)
                .limit(10).forEach(n -> System.out.printf("%4d %10s%n", n, Integer.toBinaryString(n)));

        /*
    wir erzeugen 10 zufällige Lottotipps und geben Sie in geeigneter Weise aus.
     */
        Stream.generate(() -> LottoUtil.randomTipp()).limit(10).forEach(
                (tipp) -> System.out.println(LottoUtil.tippAsString(tipp))
        );


        /*
        Wir erzeugen 10 zufällige Lottotipps, die mit den Zahlen der letzten Ziehung in genau 3 Zahlen übereinstimmen
        und geben Sie in geeigneter Weise aus.
         */
        System.out.println("*******************************************************");
        long ziehungsZahlen = LottoUtil.createTipp(4, 16, 20, 31, 34, 38);
        System.out.println("Ziehung: " + LottoUtil.tippAsString(ziehungsZahlen));
        Stream
                .generate(() -> LottoUtil.randomTipp())
                .filter(tipp -> LottoUtil.anzahlTreffer(tipp, ziehungsZahlen) == 3)
                .limit(10)
                .forEach((tipp) -> System.out.println(LottoUtil.tippAsString(tipp)));


        /*
         * wir erzeugen einen stream aus 20 Figur2D- objekten: rechtecken und kreisen.
         * die auswahl rechteck oder kreis erfolgt zufällig.
         * radius / seitenlängen sollen jeweils zufallswerte zwischen 0 und 1 sein.
         *
         * dann sortieren wir den stream aufsteigend nach der flaeche und geben ihn aus.
         *
         */


        Comparator<Figur2D> cmp = (f1, f2) -> Double.compare(f1.flaeche(), f2.flaeche());

        Stream
                .generate(() -> Math.random() > 0.5 ? new Kreis(Math.random()) : new Rechteck(Math.random(), Math.random()))
                .limit(20)
                .sorted(cmp)
                .forEach(n -> System.out.println(n));


    }


}
