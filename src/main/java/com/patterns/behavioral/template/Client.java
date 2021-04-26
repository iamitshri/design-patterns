package com.patterns.behavioral.template;

public class Client {

    public static void main(String[] args) {
        AbstractAircraft f16 = new F16();
        f16.runCheckList();
    }
}
