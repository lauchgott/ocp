package wbs.pattern.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

class StringItr implements Iterator<Character> {
    private String cs;
    private int index = 0;

    public StringItr(String cs) {
        this.cs = cs;
    }

    @Override
    public boolean hasNext() {
        return index < cs.length();
    }

    @Override
    public Character next() {
        if (!hasNext()) {
            throw new NoSuchElementException("no more elements...");
        }
        return cs.charAt(index++);
    }
}

public class IterableString implements Iterable<Character> {

    private String cs;

    public IterableString(String cs) {
        this.cs = cs;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringItr(cs);
    }

}

