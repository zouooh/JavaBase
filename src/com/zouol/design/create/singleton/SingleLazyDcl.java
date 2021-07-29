package com.zouol.design.create.singleton;

public class SingleLazyDcl {
    private volatile static SingleLazyDcl instance;
    private SingleLazyDcl(){}

    public static synchronized SingleLazyDcl getInstance() {
        if (instance == null) {
            synchronized (SingleLazyDcl.class){
                if (instance == null){
                    instance = new SingleLazyDcl();
                }
            }
        }
        return instance;
    }
}
