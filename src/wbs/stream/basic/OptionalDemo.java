package wbs.stream.basic;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> oi = Stream.of(2, 4, 1, 3)
                .max((n1, n2) -> Integer.compare(n1, n2));
        System.out.println("--- Optional.get() ---");
        Integer i = oi.get();
        System.out.println(i);
        System.out.println("--- Optional.ifPresent() ---");
        oi.filter(n -> n > 4).ifPresent(System.out::println);
        oi = Stream.<Integer>empty()
                .max((n1, n2) -> Integer.compare(n1, n2));
        System.out.println("--- Optional.get() ---");
        try {
            i = oi.get();
            System.out.println(i);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        System.out.println("--- Optional.orElse() ---");
        System.out.println(oi.orElse(1));
        System.out.println("--- Optional.orElseThrow() ---");
        try {
            System.out.println(oi.orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println("--- Optional.orElseGet() ---");
        System.out.println(oi.orElseGet(
                () -> ThreadLocalRandom.current().nextInt(100)));
    }
}