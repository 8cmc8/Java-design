package design.patterns.command.remoteControl.command.commandImpl;

import design.patterns.command.remoteControl.command.Command;

/**
 * 宏命令(控制一组动作，让一个按钮同时绑定多个命令)
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
