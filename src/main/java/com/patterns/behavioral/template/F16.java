package com.patterns.behavioral.template;

public class F16 extends AbstractAircraft {

    @Override
    protected boolean doorLocked() {
        System.out.println("F16 door locked: "+true);
        return true;
    }

    @Override
    protected void checkAirPressure() {
        System.out.println("F16 checking tire pressure");
    }
}
