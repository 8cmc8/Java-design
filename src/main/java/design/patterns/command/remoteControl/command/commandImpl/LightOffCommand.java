package design.patterns.command.remoteControl.command.commandImpl;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
