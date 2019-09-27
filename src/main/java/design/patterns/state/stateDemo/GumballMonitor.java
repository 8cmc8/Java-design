package design.patterns.state.stateDemo;

public class GumballMonitor {
    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Location: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount());
        System.out.println("Current state: " + gumballMachine.getState());
        System.out.println("\n");
    }
}
