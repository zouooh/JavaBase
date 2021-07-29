package com.zouol.design.create.singleton;

public class SingleLazy {
    private static SingleLazy instance;
    private SingleLazy (){}

    public static SingleLazy getInstance() {
        if (instance == null) {
            instance = new SingleLazy();
        }
        return instance;
    }
}
