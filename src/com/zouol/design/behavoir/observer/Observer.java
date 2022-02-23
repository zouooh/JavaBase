package com.zouol.design.behavoir.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
