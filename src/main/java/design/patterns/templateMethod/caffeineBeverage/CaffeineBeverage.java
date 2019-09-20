package design.patterns.templateMethod.caffeineBeverage;

/**
 * 咖啡因饮料抽象类
 */
public abstract class CaffeineBeverage {
    //模版方法（部分方法在子类中实现）
    //定义成final，避免子类改变这个算法的顺序
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
