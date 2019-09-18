package design.patterns.command.simpleDemo;

/**
 * 简单遥控器（调用者）
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
