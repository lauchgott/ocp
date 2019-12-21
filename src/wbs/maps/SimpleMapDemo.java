package wbs.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SimpleMapDemo {
    public static void main(String[] args) {
// diamond-operator (ab 1.7: type inference)
        NavigableMap<String, String> dict = new TreeMap<>();
        dict.put("eins", "one");
        dict.put("zwei", "two");
        dict.put("drei", "three");
        dict.put("vier", "four");
        dict.put("fünf", "five");
// wir geben die map aus.
// variante 1:
        System.out.println("--------");
        System.out.println(dict);
// variante 2:
        System.out.println("--------");
        for (String key : dict.keySet()) {
            System.out.println(key + " -> " + dict.get(key));
        }
// variante 3:
        System.out.println("--------");
        String key;
        Iterator<String> itrKeys = dict.keySet().iterator();
        while (itrKeys.hasNext()) {
            key = itrKeys.next();
            System.out.println(key + " -> " + dict.get(key));
        }
// variante 4:
        System.out.println("---- ---");
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }
// variante 5
        System.out.println("--------");
        Map.Entry<String, String> entry;
        Iterator<Map.Entry<String, String>> itrEntries = dict
                .entrySet().iterator();
        while (itrEntries.hasNext()) {
            entry = itrEntries.next();
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }
// variante 6
        System.out.println("--------");
        dict.forEach(
                (k, v) -> System.out.println(k + " -> " + v));
    }
}

/*
gibt es eine IS A beziehung zwischen Map und Collection?
 - keine direkte IS A Beziehung --> wäre allerdings möglich gewesen - war allerdings eine Design-Entscheidung, es nicht zu tun

gibt es eine IS A beziehung zwischen Map und Iterable?
 - keine IS A Beziehung zwischen Map und Iterable.

was ist ein Map.Entry? ist das ein nested interface?
Map.Entry ist ein Interface - Ist auch ein nested Interface, ist im Interface Map genested.
in der API steht unter enclosing-Interface das "umschließende Interface".
Bezeichner setzt sich mit der Dot-Schreibweise zusammen.

wie bekommt man alle keys einer map?
keySet()-Methode. Liefert ein Set von K.

wie bekommt man alle values einer map?
mit values() - bekommt man eine Collection aller Values V.
--> Collection hier, weil Values Dopplungen aufweisen können. Bei Keys ist das illegal, deswegen dort ein Set.


wie findet man zu einem key den zugehörigen value?
get() - Methode.



wie fügt man ein neues key-value-paar in eine map ein?
gibt mehrere Möglichkeiten:
put() - Methode --> Key, Value übergeben
merge() - Methode




wie findet man heraus, ob eine map einen bestimmten
key enthält?
mehrere Möglichkeiten:
get()-Methode
containsKey()
containsValue()





was sortiert eine TreeMap, und nach welchem kriterium
wird sortiert?
TreeMap sortiert nach Schlüssel.
zum sortieren ein natural Ordering notwendig.
entweder sind sie implizit vorhanden, andernfalls im Konstruktor ein Comparable mitgeben
ACHTUNG!
TreeMap kann man parameterlos aufrufen, das macht der Compiler mit. In ungünstigen Fällen knallt es aber zur Runtime.





erlaubt eine HashMap null-keys? null-values?
ein Null-Key darf vorkommen und beliebig viele null values


erlaubt eine TreeMap null-keys? null-values?
TreeMap erlaubt keine null-Keys, weil Keys eine Comparable - Implementation haben müssen, das geht für null nicht.
nullValues sind erlaubt




welche der varianten in SimpleMapDemo haben
eine eher gute performance, und welche eine eher schlechte?

Variante 2 - nicht so gute Performance. Get-Methode wird dauernd aufgerufen.
Variante 3 - Performance ähnlich schlecht, wie in 2
Variante 4 - bessere Performance, weil das Objekt vor Aufruf der get-Methode bekannt ist.
Variante 5 - so performant wie Variante 4
Variante 6 - superschick und performant ^^

Variante 4 und 6 sind beide ähnlich hübsch. kann man beide nehmen. Lambdas gehen seit Version 8.

was ist der parameter von foreach() in Map?
zusätzlich: bei "Iterationen" liefert jeder Iterationsschritt ein Key-Value-Paar.




 */