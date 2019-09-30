package design.patterns.iterator.simpleDemo;

import design.patterns.iterator.simpleDemo.menu.CafeMenu;
import design.patterns.iterator.simpleDemo.menu.DinerMenu;
import design.patterns.iterator.simpleDemo.menu.Menu;
import design.patterns.iterator.simpleDemo.menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<>(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
