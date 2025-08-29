package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterator implements Iterator<Character> {

    private final String str;
    private int currentIndex;

    public StringIterator(String str) {
        this.str = str;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < str.length();
    }

    @Override
    public Character next() {
        if (currentIndex >= str.length()) {
            throw new NoSuchElementException("Закончились символы!");
        }

        return str.charAt(currentIndex++);
    }
}
