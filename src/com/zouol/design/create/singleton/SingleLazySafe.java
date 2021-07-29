package com.zouol.design.create.singleton;

public class SingleLazySafe {
    private static SingleLazySafe instance;
    private SingleLazySafe(){}

    public static synchronized SingleLazySafe getInstance() {
        if (instance == null) {
            instance = new SingleLazySafe();
        }
        return instance;
    }
}
