package com.patterns.structural.adapter;

public class Run {

    public static void main(String[] args) {
        // Bird flying
        Bird b = new Parrot();
        b.fly();

        // human flying
        FitHuman fh = new FitHuman();
        HumanAdapter ha = new HumanAdapter(fh);
        ha.fly();
    }
}
