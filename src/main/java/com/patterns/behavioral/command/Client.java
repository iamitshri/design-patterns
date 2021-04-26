package com.patterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light l = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(l);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();
    }
}
