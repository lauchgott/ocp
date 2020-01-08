package wbs.flouebungen;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class ZufallsZahl {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(2000);

        Stream.of(
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200),
                random.nextInt(200))
                .sorted()
                .forEach(System.out::println);


    }
}
