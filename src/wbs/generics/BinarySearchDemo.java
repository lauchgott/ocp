package wbs.generics;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
das natural ordering der Klasse Person basiert auf dem Alter.
wir spendieren einen Constructor und eine passende Überschreibung von .toString()
 */
class Person implements Comparable<Person>{

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    String name;
    int alter;

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.alter,person.alter);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}

/*
Constructor und passende Überschreibung von .toString()
 */
class Mitarbeiter extends Person {
    LocalDate hireDate;
    public Mitarbeiter(String name, int alter, LocalDate hireDate){
        super(name, alter);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", hireDate=" + hireDate +
                '}';
    }
}
public class BinarySearchDemo {

    /*
    Wir bestücken eine List mit einigen Mitarbeitern.
    Dann sortieren wir die List und wenden anschließend die
    erste Überladung von .binarySearch() in geeigneter Weise an.
     */

    public static void main(String[] args) {

        Mitarbeiter gustav = new Mitarbeiter("Gustav",35, LocalDate.of(2010,1,1));
        Mitarbeiter franz = new Mitarbeiter("Franz",57,LocalDate.of(2015,5,1));
        Mitarbeiter ina = new Mitarbeiter("Ina",25,LocalDate.of(2009,7,1));
        Mitarbeiter anna = new Mitarbeiter("Anna", 18,LocalDate.of(2007,8,15));
        List<Mitarbeiter> mitarbeiter = Arrays.asList(gustav,franz,ina,anna);
        Collections.sort(mitarbeiter);
        for (Mitarbeiter ma : mitarbeiter){
            System.out.println(ma);
        }
        Mitarbeiter ma = ina;
        System.out.println(Collections.binarySearch(mitarbeiter,ma));
        ma = new Mitarbeiter("Elvira",20,LocalDate.of(2008,1,15));
        System.out.println(Collections.binarySearch(mitarbeiter,ma));
/*
Wir sortieren die list nach dem Einstellungsdatum. Für die Sortierung verwenden wir einen Compartor
und einen geeigneten Lambda für die Comparator
Liste ausgeben. Dann die 2. Überladung von .binarySearch aufrufen
 */
        Comparator<Mitarbeiter> cmp = (Mitarbeiter m1, Mitarbeiter m2) -> m1.hireDate.compareTo(m2.hireDate);
        Collections.sort(mitarbeiter,cmp);
        System.out.println("______________________________________");
        for (Mitarbeiter employee : mitarbeiter){
            System.out.println(employee);
        }
        System.out.println(Collections.binarySearch(mitarbeiter,ma,cmp));
        ma= franz;
        System.out.println(Collections.binarySearch(mitarbeiter,ma,cmp));

        Comparator<Mitarbeiter> comp1 = (Mitarbeiter m1, Mitarbeiter m2) -> m1.name.compareTo(m2.name);
        System.out.println(Collections.min(mitarbeiter,comp1));
        System.out.println(Collections.max(mitarbeiter,comp1));
    }
}