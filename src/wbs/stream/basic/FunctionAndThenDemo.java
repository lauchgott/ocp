package wbs.stream.basic;

import java.util.Objects;
import java.util.function.Function;

public class FunctionAndThenDemo {

        public static void main(String[] args) {

                int x = 0;
                System.out.println(Objects.equals(x, null));
                
                Function<Integer, String> f1 = i -> Integer.toBinaryString(i);
                Function<String, Integer> f2 = s -> s.length();
                
                Function<Integer, Integer> f = f1.andThen(f2);
                
                System.out.println(f.apply(100));
        }
}

