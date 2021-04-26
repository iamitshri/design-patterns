package com.patterns.behavioral.chainofresponsibility;

public abstract class AbstractRequest {

    private int requestCode;

    AbstractRequest(int requestCode) {
        this.requestCode = requestCode;
    }

    int getRequestCode() {
        return requestCode;
    }
}
