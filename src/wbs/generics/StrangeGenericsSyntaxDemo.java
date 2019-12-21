package wbs.generics;

import java.util.Optional;
import java.util.stream.Stream;

public class StrangeGenericsSyntaxDemo {
public static void main(String[] args) {
// compilerfehler
// Optional<Integer> oi = Stream.empty()
// .max((n1, n2) -> Integer.compare(n1, n2));
// ok
Optional<Integer> oi = Stream.<Integer>empty()
.max((n1, n2) -> Integer.compare(n1, n2));
System.out.println(oi.isPresent());
}
}