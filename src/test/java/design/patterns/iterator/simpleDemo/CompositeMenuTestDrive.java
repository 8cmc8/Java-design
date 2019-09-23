package design.patterns.iterator.simpleDemo;

import design.patterns.iterator.composite.Menu;
import design.patterns.iterator.composite.MenuComponent;
import design.patterns.iterator.composite.MenuItem;
import design.patterns.iterator.composite.Waitress;

public class CompositeMenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancakes with fried eggs, sausage",false,2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake Breakfast","Pancakes with fresh blueberries",true,3.49));

        //dinerMenu中包含dessertMenu子菜单
        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie","Apple pie with a flakey crust, topped with vanilla ice cream",true,1.59));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day, with a side salad",false,3.69));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
