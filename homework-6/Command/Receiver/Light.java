package com.dragomiralin.Command.Receiver;

import com.dragomiralin.Command.SmartObject;
import com.dragomiralin.Command.State;

public class Light implements SmartObject {
    private State defaultState = State.OFF;

    @Override
    public String pluginObject() {
        return "Light";
    }

    @Override
    public void setState(State state) {
        this.defaultState = state;
    }

    @Override
    public State getState() {
        return this.defaultState;
    }

}
