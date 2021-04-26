package com.patterns.structural.decorator;

public class InterestingPresentor implements Presentation{
    private final Presentor presentor;

    public InterestingPresentor(Presentor presentor) {
        this.presentor = presentor;
    }


    @Override
    public void present() {
        System.out.println("Tell interesting stories and give background.");
        System.out.println("Make audience laugh");
        presentor.present();
    }
}
