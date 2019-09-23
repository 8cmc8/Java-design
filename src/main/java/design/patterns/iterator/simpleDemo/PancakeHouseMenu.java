package design.patterns.iterator.simpleDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;
    private String description;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99);
        addItem("Blueberry Pancake Breakfast","Pancakes with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59);
        description = "BREAKFAST";
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
