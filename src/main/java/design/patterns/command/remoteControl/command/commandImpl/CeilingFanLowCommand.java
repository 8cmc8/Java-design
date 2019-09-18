package design.patterns.command.remoteControl.command.commandImpl;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {
    private CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
