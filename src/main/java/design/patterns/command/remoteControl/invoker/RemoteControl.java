package design.patterns.command.remoteControl.invoker;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.command.commandImpl.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    //记录前一个命令
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------RemoteControl------\n");
        for (int i = 0; i < 7; i++) {
            stringBuffer.append("slot[" + i + "] " + onCommands[i].getClass().getSimpleName()
                    + " " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuffer.toString();
    }
}
