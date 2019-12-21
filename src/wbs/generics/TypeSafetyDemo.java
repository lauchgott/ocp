package wbs.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {

    public static void main(String[] args) {
        Object[] oa = {1,3,"aha",4.0};
        String[] sa = {"aha","nana"};
        oa = sa;
        oa[0] = 17; // das geht zur Compiletime klar, gibt aber zur Runtime eine Exception, weil oa mittlerweile
                    // auf das Stringarray referenziert und dort kein int reinpasst.

        List<Object> ol = new ArrayList<>();
        ol.add(1);
        ol.add(2);
        ol.add("aha");
        ol.add(3525.44);

        List<String> sl = new ArrayList<>();
        sl.add("aha");
        sl.add("maja");
        sl.add("naja");
        sl.add("nana");

        // ol = sl;  bei generischen Typen liefert der Compiler hier schon einen Fehler.
    }
}
