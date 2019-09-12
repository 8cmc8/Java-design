package design.patterns.decorator;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    protected final static String TALL = "tall";
    protected final static String GRANDE = "grande";
    protected final static String VENTI = "venti";
    protected String description = "Unknown Beverage";
    protected String size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
