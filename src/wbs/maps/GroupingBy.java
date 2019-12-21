package wbs.maps;

import wbs.generics.SetUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class GroupingBy {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("eins","zwei","drei","vier","fünf","sechs","sieben",
                "acht","neun","zehn","elf","zwölf","dreizehn"));
        Map<Integer, Set<String>> map = SetUtil.groupingBy(set, s -> s.length());
        System.out.println("-----------Gruppierung nach Stringlänge ------------");
        map.forEach((k,v) -> System.out.println(k + " -> " + v));



        Set<Abgeordneter> set2 = new HashSet<>(Arrays.asList(new Abgeordneter("SPD"),
                new Abgeordneter("Die Linke"),new Abgeordneter("Die Linke"),
                new Abgeordneter("Die Linke"),
                new Abgeordneter("Die Linke"),new Abgeordneter("Die Linke"),
                new Abgeordneter("Die Linke"),new Abgeordneter("B90/Grüne"),new Abgeordneter("CDU"),
                new Abgeordneter("CDU"),new Abgeordneter("CSU"),new Abgeordneter("FDP")));
        Map<String, Set<Abgeordneter>> map2 = SetUtil.groupingBy(set2, s -> s.partei);
        System.out.println("----------Gruppierung nach Partei------------");
        map2.forEach((k,v) -> System.out.println(k + " -> " + v));
    }

}
