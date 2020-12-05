package com.dragomiralin.Command.Invoker;

import com.dragomiralin.Command.Command;

public class RemoteControl {

    public RemoteControl() {
    }

    public String executeCommand(Command command) {
        command.execute();
        return "Done";
    }


}
