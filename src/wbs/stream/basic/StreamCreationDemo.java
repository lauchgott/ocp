package wbs.stream.basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        System.out.println("--- Stream.of() ---");
        Stream.of(1, 2, 3).forEach(System.out::println);
        System.out.println("--- Arrays.stream() ---");
        Arrays.stream(new int[]{1, 2, 3})
                .forEach(System.out::println);
        System.out.println("--- Collection.stream() ---");
        Arrays.asList(1, 2, 3).stream().forEach(System.out::println);
        System.out.println("--- Stream.generate() ---");
        Stream.generate(Math::random).limit(5)
                .forEach(System.out::println);
        System.out.println("--- Stream.iterate() ---");
        Stream.iterate(1, x -> x + 1).limit(3L)
                .forEach(System.out::println);


        System.out.println("---------------------");
        List<Integer> zahlen = new ArrayList<Integer>();
        for(int i=1;i<=10000;i++){
            zahlen.add(i);
        }
        Collections.shuffle(zahlen);
        System.out.println(zahlen);

        System.out.println("************************");
        zahlen.stream().  filter(n -> n % 2 == 0 && n < 300).forEach(System.out::println);

    }
}