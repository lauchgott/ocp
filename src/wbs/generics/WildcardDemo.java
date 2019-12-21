package wbs.generics;

import java.util.ArrayList;
import java.util.List;

class Frucht {
}

class Apfel extends Frucht {
}

class Birne extends Frucht {
}

public class WildcardDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Frucht> fruechte = new ArrayList<>();
        // auf extendsFruechte darf jede List zugewiesen werden, deren deklarierter Elementtyp Frucht oder ein
        // Subtyp von Frucht ist.
        List<? extends Frucht> extendsFruechte = new ArrayList<>();
        List<Apfel> apfels = new ArrayList<>();
        List<Birne> birnens = new ArrayList<>();
        extendsFruechte = apfels; //ok!
        extendsFruechte = birnens; // ok!
        // auf superFruechte darf jede List zugewiesen werden, deren deklarierter Elementtyp Frucht oder ein
        // Supertyp von Frucht ist.
        List<? super Frucht> superFruechte = new ArrayList<>();
        superFruechte.add(new Apfel()); // ok
        superFruechte.add(new Birne()); // ok
        superFruechte.add(new Frucht()); // ok
        List<Birne> birnen = new ArrayList<>();
// fruechte = birnen; // compilerfehler
// extendsFruechte.add(new Birne()); // compilerfehler
        extendsFruechte.add(null); // ok
        Frucht frucht = extendsFruechte.get(0); // ok
        superFruechte.add(new Birne()); // ok
        superFruechte.add(null);
// frucht = superFruechte.get(0); // compilerfehler
        Object o = superFruechte.get(0); // ok

    }
}