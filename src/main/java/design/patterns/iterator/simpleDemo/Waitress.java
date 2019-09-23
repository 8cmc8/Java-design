package design.patterns.iterator.simpleDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu next = menuIterator.next();
            Iterator<MenuItem> menuItemIterator = next.createIterator();
            System.out.println("\n" + next.getDescription());
            System.out.println("------");
            printMenu(menuItemIterator);
        }

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " --- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
