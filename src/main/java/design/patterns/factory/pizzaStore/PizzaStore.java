package design.patterns.factory.pizzaStore;

import design.patterns.factory.pizza.Pizza;

/**
 * 披萨店抽象类（Creator）
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //定义工厂方法，用于创建披萨
    public abstract Pizza createPizza(String type);
}
