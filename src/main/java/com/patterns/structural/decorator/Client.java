package com.patterns.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Presentor p =new Presentor();
        p.present();

        System.out.println();
        InterestingPresentor interestingPresentor = new InterestingPresentor(p);
        interestingPresentor.present();
    }

}
