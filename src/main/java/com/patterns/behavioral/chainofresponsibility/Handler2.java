package com.patterns.behavioral.chainofresponsibility;

public class Handler2 extends AbstractHandler {

    private AbstractHandler nextHandler;

    Handler2(AbstractHandler next) {
        super(next);
        nextHandler = next;
    }

    public void handleRequest(AbstractRequest request) {
        System.out.println("handler2 on request: " + request.getRequestCode());
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
