package design.patterns.iterator.simpleDemo.menu;

import design.patterns.iterator.simpleDemo.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
    String getDescription();
}
