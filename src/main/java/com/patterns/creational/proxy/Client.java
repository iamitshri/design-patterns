package com.patterns.creational.proxy;

public class Client {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("website_banner");
        proxyImage.display();
    }
}
