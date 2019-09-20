package design.patterns.templateMethod.caffeineBeverage;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
