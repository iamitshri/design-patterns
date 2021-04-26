package com.patterns.behavioral.command;

public class SimpleRemoteControl {

    Command slot;

    void setCommand(Command command) {
        slot = command;
    }

    void buttonPressed() {
        slot.execute();
    }
}
