package com.company.行为型.observerMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午5:16
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
