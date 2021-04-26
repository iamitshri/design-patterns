package com.patterns.behavioral.chainofresponsibility;

public class Request1 extends AbstractRequest {

    private int requestCode;

    Request1(int requestCode) {
        super(requestCode);
        this.requestCode = requestCode;
    }
}
