package design.patterns.iterator.simpleDemo;

import java.util.ArrayList;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99);
        addItem("Blueberry Pancake Breakfast","Pancakes with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
