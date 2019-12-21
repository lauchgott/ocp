package wbs.stream.basic;



/*
    Wir illustrieren die folgenden Methoden von Strem
    allMatch(), anyMatch() und noneMatch()
     */


import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class MatchDemo {

    public static void main(String[] args) {
//        List<Integer> zahlen = new LinkedList<>();
//        boolean allMatch = false;
//        boolean noneMatch = false;
//        boolean anyMatch = false;
//
//
//        for(int i = 0; i < 1000; i++){
//            zahlen.add(i);
//        }
//
//        allMatch = zahlen.stream()
//                .allMatch(p -> p < 1000);
//        anyMatch = zahlen.stream()
//                .anyMatch(p -> p%2 == 0);
//        noneMatch = zahlen.stream()
//                .noneMatch(p -> p <= 500);
//        System.out.println("allMatch: " + allMatch);
//        System.out.println("anyMatch: " + anyMatch);
//        System.out.println("noneMatch: " + noneMatch);
//

        boolean b;

        b = Stream.generate(()-> Math.random()).limit(100).allMatch(x -> x < 1.0);
        System.out.println(b); // immer true;

        b = Stream.iterate(2, n -> n * 2).limit(20).anyMatch(n -> n % 2 == 1);
        System.out.println(b); //immer false;

        BigInteger TWO = BigInteger.valueOf(2);
        b = Stream.iterate(BigInteger.valueOf(11), bi -> bi.nextProbablePrime()).limit(100).noneMatch(bi -> bi.divide(TWO).equals(BigInteger.ZERO));
        System.out.println(b); // immer true;




    }
}
/*
Was sind hier terminal operations?
vermutlich allMatch(), anyMatch() und noneMatch()

Was sind hier intermediate operations?
limit()




 */