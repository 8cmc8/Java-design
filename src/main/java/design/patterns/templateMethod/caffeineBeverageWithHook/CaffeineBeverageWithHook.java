package design.patterns.templateMethod.caffeineBeverageWithHook;

/**
 * 咖啡因饮料抽象类（带钩子方法）
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //钩子方法（子类可以重写）
    //钩子能够作为条件控制，影响抽象类中的算法流程
    boolean customerWantsCondiments() {
        return true;
    }
}
