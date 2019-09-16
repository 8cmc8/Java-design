package design.patterns.factory.pizzaStore.impl;

import design.patterns.factory.pizza.Pizza;
import design.patterns.factory.pizza.impl.ChicagoStyleCheesePizza;
import design.patterns.factory.pizza.impl.ChicagoStylePepperoniPizza;
import design.patterns.factory.pizzaStore.PizzaStore;

/**
 * 芝加哥披萨店（ConcreteCreator）
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
