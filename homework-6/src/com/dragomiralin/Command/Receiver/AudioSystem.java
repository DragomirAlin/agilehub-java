package com.dragomiralin.Command.Receiver;

import com.dragomiralin.Command.SmartObject;
import com.dragomiralin.Command.State;

public class AudioSystem implements SmartObject {
    private State defaultState = State.DOWN;

    @Override
    public String pluginObject() {
        return "Audio System";
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
