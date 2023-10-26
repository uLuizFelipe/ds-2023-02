package org.example.model;

import org.example.annotation.Observer;
import org.example.observOps.ObserverInterface;

@Observer(value = "objeto")
public class ObjectObserver implements ObserverInterface {

    @Override
    public String getValue() {
        Observer annotation = ObjectObserver.class.getAnnotation(Observer.class);
        if (annotation != null) {
            return annotation.value();
        }
        return "";
    }

    @Override
    public void update() {
        System.out.println("ObjectObserver foi notificado.");
    }
}