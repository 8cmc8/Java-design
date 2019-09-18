package design.patterns.command;

import design.patterns.command.remoteControl.command.Command;
import design.patterns.command.remoteControl.command.commandImpl.*;
import design.patterns.command.remoteControl.invoker.RemoteControl;
import design.patterns.command.remoteControl.receiver.CeilingFan;
import design.patterns.command.remoteControl.receiver.Light;
import design.patterns.command.remoteControl.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnWithRadioCommand stereoOnWithRadioCommand = new StereoOnWithRadioCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOnCommand, stereoOnWithCdCommand, ceilingFanLowCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand, ceilingFanOffCommand};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCdCommand, stereoOffCommand);
        remoteControl.setCommand(2, stereoOnWithRadioCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, partyOnCommand, partyOffCommand);

        System.out.println(remoteControl);

//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
//        remoteControl.undoButtonWasPressed();
//        remoteControl.onButtonWasPressed(1);
//        remoteControl.offButtonWasPressed(1);
//        remoteControl.onButtonWasPressed(2);
//        remoteControl.offButtonWasPressed(2);
//        remoteControl.undoButtonWasPressed();
//        remoteControl.onButtonWasPressed(3);
//        remoteControl.onButtonWasPressed(4);
//        remoteControl.undoButtonWasPressed();
//        remoteControl.offButtonWasPressed(4);
//        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(5);
        remoteControl.offButtonWasPressed(5);
        remoteControl.undoButtonWasPressed();
    }
}
