package design.patterns.factory.pizza.impl;

import design.patterns.factory.pizza.Pizza;

/**
 * 纽约腊肠风味披萨(ConcreteProduct)
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
