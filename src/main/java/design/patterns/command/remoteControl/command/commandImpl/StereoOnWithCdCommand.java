package design.patterns.command.remoteControl.command.commandImpl;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.receiver.Stereo;

public class StereoOnWithCdCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
