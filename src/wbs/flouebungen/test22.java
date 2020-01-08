package wbs.flouebungen;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;




public class test22 {

    public static void main(String[] args) {

        LocalDate jetzt = LocalDate.now();
        LocalDate vorAchtzehnJahren = jetzt.minusYears(18);
        DateTimeFormatter european = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate DOB = LocalDate.of(1988,4,22);
        Period alter = Period.between(DOB,jetzt);

        System.out.println("Du bist jetzt " + alter.getYears() + " Jahre alt.");

        System.out.println("Wenn du vor dem " + european.format(vorAchtzehnJahren) + " geboren bist, darfst du hier nicht rein.");


                LocalDate pruefung = LocalDate.of(2020,1,10);
                LocalDate today = LocalDate.now();
                Period days = Period.between(today,pruefung);
                System.out.println(days.getDays());


                LocalDate Bububurtstag = LocalDate.of(1990,11,24);
        System.out.println("Mein Bubu ist an einem " + Bububurtstag.getDayOfWeek() + " geboren.");

        System.out.println("pietzi was born on a : " + LocalDate.of(2009,11,27).getDayOfWeek());
        System.out.println("zolt was born on a : " + LocalDate.of(2005,9,19).getDayOfWeek());


            }
        }
