package design.patterns.iterator.simpleDemo;

/**
 * 晚餐厅菜单
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT","(Fakin') Bacon With lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon With lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full, can't add item to menu!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
