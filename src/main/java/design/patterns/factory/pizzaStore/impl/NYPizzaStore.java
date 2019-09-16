package design.patterns.factory.pizzaStore.impl;

import design.patterns.factory.pizza.Pizza;
import design.patterns.factory.pizza.impl.NYStyleCheesePizza;
import design.patterns.factory.pizza.impl.NYStylePepperoniPizza;
import design.patterns.factory.pizzaStore.PizzaStore;

/**
 * 纽约披萨店(ConcreteCreator)
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
