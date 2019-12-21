package wbs.stream.references;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class StaticMethodReferenceDemo {
    public static void m1(Supplier<Double> supplier) {
        System.out.println(Math.sqrt(supplier.get()));
    }

    public static void m2(DoubleSupplier supplier) {
        System.out.println(Math.sqrt(supplier.getAsDouble()));
    }

    public static void main(String[] args) {
        Supplier<Double> supplier1 = Math::random;
        DoubleSupplier supplier2 = Math::random;
        m1(supplier1);
        m2(supplier2);
    }
}

/*
Durch die primitiven Typen kommen ein paar Duzend neue Methoden hinzu. Das nervt, aber es ist halt so, sagt Günni
 */