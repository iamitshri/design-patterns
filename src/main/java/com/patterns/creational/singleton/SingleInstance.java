package com.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.Collections;

public class SingleInstance {
    // static initialization is thread safe, but its  eager initialization
    private static SingleInstance instance;

    private SingleInstance() {
        Collections.sort(new ArrayList<String>());
    }

    private static class ResourceHolder {
        static final SingleInstance resource = new SingleInstance(); // This will be lazily initialised
    }

    public static SingleInstance getInstanceViaInnerClass() {
        return ResourceHolder.resource;
    }

    public static synchronized SingleInstance getInstanceThreadSafe() {
        if (instance == null) {
            instance = new SingleInstance();
        }
        return instance;
    }
    // This is way is deprecated
    // Double checked locking is now considered an antipattern
    public SingleInstance getInstance() {
        if (instance == null) {
            synchronized (SingleInstance.class) {
                if (instance == null) {
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }
}
