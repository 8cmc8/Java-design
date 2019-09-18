package design.patterns.command.remoteControl.command.commandImpl;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
