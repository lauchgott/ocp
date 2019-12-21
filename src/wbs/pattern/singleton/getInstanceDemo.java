package wbs.pattern.singleton;

public class getInstanceDemo {
    public static void main(String[] args) {
        /*
        Wir führen den Nachweis, dass bei mehrfachen Aufrufen von
        getIntance nur eine Instanz der Klasse erzeugt wird.
         */
        Object obj = Singleton1.getInstance();
        Object obj2 = Singleton1.getInstance();
        System.out.println(obj == obj2);


        /*

-----------------
wo haben wir im diagramm generalisierungen, wo
assoziationen?

Generalisierungen sind Konkretes Aggregat zu Aggregat und KonkreterIterator
zu Iterator.

Assoziationen zwischen Konkretem Aggregat und Konkretem Iterator
und zwischen Konkretem Aggregat und Element und zwischen konkretem
Iterator und Element.

was bedeutet es, wenn in UML ein bezeichner kursiv dargestellt ist?
dass es sich um eine abstrakte Klasse/Methode handelt

was sind im jdk entsprechungen für
- Aggregat bsp. List
- KonkretesAggregat bsp: ArrayList
- Iterator - Iterator in Java
- KonkreterIterator - eine nicht-abstrakte Klasse, die Iterator
   implementiert
- Element - irgendein Element innerhalb der eben genannten ArrayList

kennen wir bereits ein beispiel für einen internen iterator?
For - Each Methode hat einen internen Iterator, den Parameter

wie heissen die methoden von Iterator in Java?

gibt es in java iteratoren, die nicht robust sind?
Ja, die gibt es und man muss in der Doku gucken, ob robust oder nicht
         */

        
    }
}
