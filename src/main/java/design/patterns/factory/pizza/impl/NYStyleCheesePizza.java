package design.patterns.factory.pizza.impl;

import design.patterns.factory.pizza.Pizza;

/**
 * 纽约芝士风味披萨(ConcreteProduct)
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
