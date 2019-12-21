package wbs.generics;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class FilterDemo {

    public static void main(String[] args) {

            Set<String> liste=new HashSet<>();
            liste.add("Hegel");
            liste.add("Marx");
            liste.add("deBeauvoir");
            liste.add("Weil");
            liste.add("Heidegger");
            liste.add("Wittgenstein");


            int counter = SetUtil.count(liste,p -> p.contains("eg"));
            System.out.println(counter);

            Set<String> newList = SetUtil.filter(liste, p -> p.contains("e"));
            newList.forEach(e -> System.out.println(e));


        Comparator<String> cmp = (String m1, String m2) -> m1.compareToIgnoreCase(m2);

        System.out.println(SetUtil.filter(liste, p -> p.contains("e"),cmp));

        }

    }


