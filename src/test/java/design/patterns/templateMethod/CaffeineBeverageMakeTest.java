package design.patterns.templateMethod;

import design.patterns.templateMethod.caffeineBeverage.Coffee;
import design.patterns.templateMethod.caffeineBeverage.Tea;

public class CaffeineBeverageMakeTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println("------------------");
        coffee.prepareRecipe();
    }
}
