package design.patterns.command.remoteControl.receiver;

/**
 * 电风扇（有状态的接收者）
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("ceilingFan is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("ceilingFan is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("ceilingFan is low");
    }

    public void off() {
        speed = OFF;
        System.out.println("ceilingFan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
