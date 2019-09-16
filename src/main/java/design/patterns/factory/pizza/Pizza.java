package design.patterns.factory.pizza;

import java.util.ArrayList;

/**
 * 披萨抽象类（Product）
 */
public abstract class Pizza {
    //披萨名称
    protected String name;
    //面团
    protected String dough;
    //酱料
    protected String sauce;
    //一套佐料
    protected ArrayList<String> toppings = new ArrayList();

    public void prepare() {
        System.out.println("Prepare pizza " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
