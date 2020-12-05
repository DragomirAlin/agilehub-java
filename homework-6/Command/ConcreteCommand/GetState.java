package com.dragomiralin.Command.ConcreteCommand;

import com.dragomiralin.Command.Command;
import com.dragomiralin.Command.SmartObject;

public class GetState implements Command {
    private SmartObject smartObject;

    public GetState(SmartObject smartObject) {
        this.smartObject = smartObject;
    }

    @Override
    public void execute() {
        System.out.println(smartObject.getState());
    }
}
