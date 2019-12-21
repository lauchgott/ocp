package wbs.stream.basic;

import javax.swing.text.html.Option;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageDemo {

    /*
    Wir illustrieren 2 verschiedene Wege, um den Durchschnitt aller Elemente
    eines IntStream zu ermitteln
     */

    public static IntStream createIntStream(){
        IntStream is;
        is = Math.random() < 0.33 ? IntStream.empty()
                :Math.random() < 0.66 ? IntStream.of(0)
                : IntStream.of(-1,1,-2,2);
        return is;
    }





    public static void main(String[] args) {

        double avg = createIntStream().summaryStatistics().getAverage();
        OptionalDouble optional = createIntStream().average();


        System.out.println("getAverage() von IntSummaryStatistics: " + avg);
        optional.ifPresent(x -> System.out.println("average() von IntStream: " + x));

    }

}
