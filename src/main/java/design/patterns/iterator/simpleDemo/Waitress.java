package design.patterns.iterator.simpleDemo;

import design.patterns.iterator.simpleDemo.menu.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        //ArrayList的iterator方法获取迭代器（获取菜单迭代器）
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu next = menuIterator.next();
            //使用菜单自定义的createIterator方法获取迭代器（获取每个菜单中菜单项的迭代器）
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
