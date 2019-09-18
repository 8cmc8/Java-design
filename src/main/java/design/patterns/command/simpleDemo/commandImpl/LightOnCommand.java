package design.patterns.command.simpleDemo.commandImpl;

import design.patterns.command.simpleDemo.Command;
import design.patterns.command.simpleDemo.Light;

/**
 * 具体命令（开灯命令）
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
