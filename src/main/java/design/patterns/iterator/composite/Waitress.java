package design.patterns.iterator.composite;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVegetarian Menu\n------------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                //如果菜单组件不支持这个操作，就对异常置之不理
                //这里要传达的意思是isVegetarian是Menu没有支持的操作
                //因此对异常置之不理是合理的做法
            }
        }
    }
}
