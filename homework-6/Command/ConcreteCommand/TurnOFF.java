package com.dragomiralin.Command.ConcreteCommand;

import com.dragomiralin.Command.Command;
import com.dragomiralin.Command.SmartObject;
import com.dragomiralin.Command.State;

public class TurnOFF implements Command {
    private SmartObject smartObject;
    private String object;

    public TurnOFF(SmartObject smartObject) {
        this.smartObject = smartObject;
        this.object = smartObject.pluginObject();
    }

    @Override
    public void execute() {
        smartObject.setState(State.OFF);
        System.out.println(object + " " + State.OFF.name());

    }
}
