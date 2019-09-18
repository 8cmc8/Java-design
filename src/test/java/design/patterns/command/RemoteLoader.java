package design.patterns.command;

import design.patterns.command.remoteControl.command.commandImpl.*;
import design.patterns.command.remoteControl.invoker.RemoteControl;
import design.patterns.command.remoteControl.receiver.Light;
import design.patterns.command.remoteControl.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnWithRadioCommand stereoOnWithRadioCommand = new StereoOnWithRadioCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCdCommand, stereoOffCommand);
        remoteControl.setCommand(2, stereoOnWithRadioCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}
