package com.kastro;

public abstract class Animals {
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animals(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public abstract void run(int runDistance);
    public abstract void swim(int swimDistance);


}
