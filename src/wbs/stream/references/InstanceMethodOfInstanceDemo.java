package wbs.stream.references;

import java.util.*;

public class InstanceMethodOfInstanceDemo {
static class C {
int n;
void m(String s) {
System.out.println(n + ":" + s.length());
n++;
}
}
public static void main(String[] args) throws InterruptedException /* diese Exception spielt hier überhaupt keine Rolle.  */ {
List<String> names = Arrays.asList("A", "BBB", "CC", "DDDD");
C c = new C();

List<String> bierwurst = new LinkedList<>();
bierwurst.add("Was?");
bierwurst.add("Gehd");
bierwurst.add("Leude");
bierwurst.add("Seid");
/*
hier wird über jedes Element von names iteriert und bei
jedem Iterationsschritt für das durch c referenzierte Objekt
die Methode m aufgerufen (mit dem aktuellen Element als Argument)
 */
names.forEach(c::m);
// Compiler kennt den ReferenceType von c , das ist C . Er schaut, ob es eine Methode m in dieser Klasse liegt
    // das ist der Fall. Die Methode braucht einen Parameter, das ist hier String. Da wir die Methode in der Methodenreferenz
    // in einer ForEach aufrufen, schaut der Compiler, ob die ÜbergabeParameter vom Typ String sind. Das sind sie hier. In Names ersichtlich.

    System.out.println("-----------------mit lambda------------------");
    C c2 = new C();
    names.forEach(s -> c2.m(s));
}
}