package com.patterns.behavioral.strategy;



public class Client {

    public static void main(String[] args) {
        Context c = new Context();
        c.setStrategy(new AddStrategy());
        c.execute(10,10);

        c.setStrategy(new MultiplyStrategy());
        c.execute(10,10);
     }
}
