package com.patterns.behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        Handler3 handler3 = new Handler3(null);
        Handler2 handler2 = new Handler2(handler3);
        Handler1 handler1 = new Handler1(handler2);

        Request1 request1 = new Request1(1);
        handler1.handleRequest(request1);
    }
}
