package com.patterns.behavioral.template;

public abstract class AbstractAircraft {

    final public void runCheckList(){

        doorLocked();
        isFuelEnough();
        checkAirPressure();
    }

    protected abstract void checkAirPressure();

    // allow subclasses to override
    protected  boolean doorLocked(){
        System.out.println("default door locked: "+false);
        return false;
    }

    // do not allow overriding 
    protected final  void isFuelEnough(){
        System.out.println("checking fuel level..");
    }
}
