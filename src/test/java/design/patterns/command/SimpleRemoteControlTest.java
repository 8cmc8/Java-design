package design.patterns.command;

import design.patterns.command.simpleDemo.Light;
import design.patterns.command.simpleDemo.SimpleRemoteControl;
import design.patterns.command.simpleDemo.commandImpl.LightOnCommand;

/**
 * 简单遥控器测试
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        //调用者
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //接收者
        Light light = new Light();
        //命令对象（将接收者传给它）
        LightOnCommand lightOn = new LightOnCommand(light);

        //把命令传给调用者
        remote.setCommand(lightOn);
        //模拟按下按钮
        remote.buttonWasPressed();
    }
}
