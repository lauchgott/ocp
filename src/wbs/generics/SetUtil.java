package wbs.generics;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class SetUtil {


    // wir schreiben die methode count().
// sie ermittelt, wie viele elemente eines sets eine gegebene eigenschaft haben.
// bsp1.: wie viele elemente eines sets von String haben die länge 3?
// bsp2.: wie viele einwohner einer stadt sind jünger als 65?

    public static <T> int count(Collection<T> collection, Predicate<? super T> predicate){

        int counter = 0;

        for (T t : collection){

            if(predicate.test(t)){

                counter++;

            }
        }

        return counter;
    }

// wir schreiben die methode filter().
// sie liefert zu einem set ein subset, das alle elemente des sets enthält,
// die eine gegebene eigenschaft haben


    public static <T> Set<T> filter(Set<T> set,Predicate<? super T> predicate) {

        Set<T> subset = new HashSet<>();

        for (T element : set) {

            if (predicate.test(element)) {

                subset.add(element);

            }
        }
        return subset;
    }


// wir überladen die methode filter().
// die überladene version stellt sicher, dass das gelieferte subset
// sortiert ist.
// die sortierung übernimmt ein comparator, der der methode als 3. argument
// übergeben wird.

    public static <T> NavigableSet<T> filter(Set<T> set, Predicate <? super T> predicate , Comparator<? super T> cmp) {

        NavigableSet<T> subset = new TreeSet<>(cmp);

        for (T element : set) {

            if (predicate.test(element)) {

                subset.add(element);

            }
        }

        return subset;
    }

    // ein stellenvermittler listet zu einem stellenangebot alle stellensuchenden
    // auf,
    // die zu diesem stellenangebot passen.
    // ein partnervermittler listet zu einem partnersuchenden alle partnersuchenden
    // auf, die zum partnersuchenden passen...
    // methodenname: candidates()

    public static <T1, T2> Set<T2> candidates(T1 t1, Set<T2> set, BiPredicate<? super T1,? super T2> predicate){
        Set<T2>matchingCandidates = new HashSet<>();
        for (T2 offer : set){
            if (predicate.test(t1,offer)){
                matchingCandidates.add(offer);
            }
        }
        return matchingCandidates;
    }


    public static <T, P> Map<P, Set<T>> groupingBy(Set<T> set,
                                                   Function<T, P> function) {
        Map<P, Set<T>> result = new HashMap<>();
        P property;
        Set<T> subSet;
        for (T t : set) {
            property = function.apply(t);
            subSet = result.get(property);
            if (subSet == null) {
                subSet = new HashSet<>();
                result.put(property, subSet);
            }
            subSet.add(t);
        }
        return result;
    }

    public static <T> Map<Boolean, Set<T>> partitioningBy(Set<T> set, Predicate<? super T> predicate){

        Map<Boolean, Set<T>> result = new HashMap<>();

        Set<T> trueValues = new HashSet<>();
        Set<T> falseValues = new HashSet<>();

        for (T t : set) {
            if(predicate.test(t)){
                trueValues.add(t);
            } else{
                falseValues.add(t);
            }
        }
        result.put(true, trueValues);
        result.put(false, falseValues);

        return result;
    }


}

