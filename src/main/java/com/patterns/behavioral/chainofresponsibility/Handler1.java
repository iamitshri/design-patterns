package com.patterns.behavioral.chainofresponsibility;

public class Handler1 extends AbstractHandler {

    private AbstractHandler nextHandler;

    Handler1(AbstractHandler next) {
        super(next);
        nextHandler = next;
    }

    public void handleRequest(AbstractRequest request) {
        System.out.println("handler1 on request: " + request.getRequestCode());
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
