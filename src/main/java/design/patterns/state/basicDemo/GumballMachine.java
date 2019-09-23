package design.patterns.state.basicDemo;

/**
 * 糖果机
 */
public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUERTER = 1;
    private final static int HAS_QUERTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUERTER;
        }
    }

    public void insertQuarter() {
        if (state == NO_QUERTER) {
            System.out.println("You insert a quarter");
            state = HAS_QUERTER;
        } else if (state == HAS_QUERTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine is sold out, you can't insert");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUERTER) {
            System.out.println("Quarter returned");
            state = NO_QUERTER;
        } else if (state == NO_QUERTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUERTER) {
            System.out.println("You turned ...");
            state = SOLD;
            dispense();
        } else if (state == NO_QUERTER) {
            System.out.println("You turned but there is no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned but there is no gumball");
        } else if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count -= 1;
            if (count == 0) {
                state = SOLD_OUT;
            } else {
                state = NO_QUERTER;
            }
        } else if (state == NO_QUERTER) {
            System.out.println("You need to pay first");
        } else if (state == HAS_QUERTER) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        StringBuffer info = new StringBuffer("Inventory: " + count + " gumballs");
        if (state == NO_QUERTER) {
            info.append("\nMachine is waiting for quarter\n");
            return info.toString();
        } else if (state == SOLD_OUT) {
            info.append("\nMachine is sold out\n");
            return info.toString();
        } else if (state == HAS_QUERTER) {
            info.append("\nMachine is waiting for you to turn crank\n");
            return info.toString();
        } else {
            info.append("\nMachine is being sold, please wait\n");
            return info.toString();
        }
    }
}
