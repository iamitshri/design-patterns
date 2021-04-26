package com.patterns.behavioral.chainofresponsibility;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    AbstractHandler(AbstractHandler next) {
        nextHandler = next;
    }

    public void handleRequest(AbstractRequest request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
