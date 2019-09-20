package design.patterns.templateMethod;

import design.patterns.templateMethod.caffeineBeverageWithHook.CoffeeWithHook;
import design.patterns.templateMethod.caffeineBeverageWithHook.TeaWithHook;

public class CaffeineBeverageWithHookMakeTest {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
