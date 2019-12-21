package wbs.stream.references;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo {


    public static void main(String[] args) {
        Supplier<Random> supplier = Random::new;
        Function<String, Integer> function1 = Integer::new;

        System.out.println(supplier.get().nextInt(1000));
        System.out.println(function1.apply("123"));
    }
}
