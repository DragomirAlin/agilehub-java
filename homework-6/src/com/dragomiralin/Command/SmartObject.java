package com.dragomiralin.Command;

public interface SmartObject {

    String pluginObject();
    void setState(State state);
    State getState();
}
