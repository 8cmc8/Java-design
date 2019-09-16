package design.patterns.factory;

import design.patterns.factory.pizza.Pizza;
import design.patterns.factory.pizzaStore.PizzaStore;
import design.patterns.factory.pizzaStore.impl.ChicagoPizzaStore;
import design.patterns.factory.pizzaStore.impl.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
