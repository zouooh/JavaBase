package com.zouol.design.create.singleton;

public class SingleStatic {
    private static class SingletonHolder {
        private static final SingleStatic INSTANCE = new SingleStatic();
    }

    private SingleStatic() {
    }

    public static final SingleStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
