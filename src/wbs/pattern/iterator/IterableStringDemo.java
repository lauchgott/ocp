package wbs.pattern.iterator;

import java.util.Iterator;

/*
 * retroanalyse is fun :)
 * 
 * was können sie alles über die klasse IterableString sagen?
 * 
 * 1 welches interface wird von IterableString implementiert?
 * => Iterable<Character> - logisch, oder?
 * 2 welche methode(n) muss die klasse IterableString anbieten?
 * => public Iterator<Character> iterator(){}
 * 3 kann die klasse IterableString abstract sein?
 * => Nein. Sie wird konkret instanziiert.
 * 4 welche(n) konstruktor(en) muss die klasse anbieten?
 * => Konstruktor mit String oder CharSequence als Übergabeparameter
 * 5 welche hilfsklasse wird benötigt?
 * => Eine Hilfsklasse, die das Interface Iterator<Character> implementiert
 * Konkret: StringItr implements Iterator<Character>
 * 6 welches interface muss diese hilfsklasse implementieren?
 * => Iterator<Character>
 * 7 welche methoden muss diese hilfsklasse implementieren?
 * => public Character next(), public boolean hasNext(), ( public void remove() -
 * die geerbte Methode von remove() schmeißt lediglich eine Exception. Das ist für
 * unseren Einsatz allerdings zweckmäßig, weil Strings immutable sind, und ich daher
 * keinen Remove in einem String machen darf. ) ,
 */

public class IterableStringDemo {

        public static void main(String[] args) {
                
                // mit foreach
                IterableString s = new IterableString("what a wonderful day");
                for (Character c : s) {
                        System.out.println(c);
                }
                
                // so geht es auch...
                System.out.println("------------");
                Iterator<Character> itr = s.iterator();
                while(itr.hasNext()) {
                        System.out.println(itr.next());
                }
        }
}


