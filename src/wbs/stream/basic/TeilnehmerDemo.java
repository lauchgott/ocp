 package wbs.stream.basic;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

 class Teilnehmer {

        LocalDate geburtsjahr;
        String name;


        public Teilnehmer(LocalDate geburtsjahr, String name) {
                this.geburtsjahr = geburtsjahr;
                this.name = name;
        }

        @Override
        public String toString() {
                return "Teilnehmer [geburtsjahr=" + geburtsjahr + ", name=" + name
                                + "]";
        }
}

public class TeilnehmerDemo {
        // wir erzeugen einen stream von teilnehmern.
        // wir berechnen das durchschnittsalter aller teilnehmer und geben es aus.
        // dann sortieren wir den stream aufsteigend nach dem abstand
        // der teilnehmer vom durchschnittsalter (die jüngsten und die ältesten
        // teilnehmer kommen also ans ende, und am anfang stehen die teilnehmer, deren alter
        // nahe beim durchschnittsalter ist).
        
        // hinweis: mapToLong() von Stream und summaryStatistics() von LongStream
        // könnten nützlich sein...
        
        public static void main(String[] args) {


                LocalDate currentDate = LocalDate.now();

                Teilnehmer[] tnList = {new Teilnehmer(LocalDate.of(1984,12,10),"Anne"),
                        new Teilnehmer(LocalDate.of(1990,12,12),"Bertram"),
                        new Teilnehmer(LocalDate.of(1989,12,11),"Cedrick"),
                        new Teilnehmer(LocalDate.of(1987,10,4),"Daniela"),
                        new Teilnehmer(LocalDate.of(1988,04,23),"Evelyn")};
//
//                int averageAge = 0;
//
//                for(Teilnehmer n : tnList){
//                        averageAge += n.age;
//                        System.out.println(averageAge);
//                }
//                averageAge = averageAge / tnList.size();
//                System.out.println(averageAge);

               Stream<Teilnehmer> tnStream = Stream.of(tnList);



                Function<Teilnehmer, Integer> age = tn -> {
                        return (int) ChronoUnit.YEARS.between(tn.geburtsjahr, currentDate);
                };

                tnStream.forEach(tn -> System.out.println(tn + " -> " + age.apply(tn)));

                Consumer<Teilnehmer> consumer = tn -> System.out.println(tn + " -> " + age.apply(tn));

                double avg = Stream.of(tnList).peek(consumer).mapToInt(t -> age.apply(t)).summaryStatistics().getAverage();

                System.out.println("Durchschnittsalter: " + avg);

                Comparator<Teilnehmer> cmp = (t1,t2) -> {
                        int alter1 = age.apply(t1);
                        int alter2 = age.apply(t2);
                        double diff1 = Math.abs(avg - alter1);
                        double diff2 = Math.abs(avg - alter2);
                        int diff = Double.compare(diff1,diff2);
                        return diff != 0 ? diff : t1.geburtsjahr.compareTo(t2.geburtsjahr);
                };

                Stream.of(tnList).sorted(cmp).forEach(consumer);


                
        }

}

