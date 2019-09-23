package design.patterns.iterator.simpleDemo;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
    String getDescription();
}
