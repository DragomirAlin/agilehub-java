package com.dragomiralin;

import com.dragomiralin.Command.ConcreteCommand.GetState;
import com.dragomiralin.Command.ConcreteCommand.TurnOFF;
import com.dragomiralin.Command.ConcreteCommand.TurnON;
import com.dragomiralin.Command.ConcreteCommand.TurnVolumeUP;
import com.dragomiralin.Command.Invoker.RemoteControl;
import com.dragomiralin.Command.Receiver.AudioSystem;
import com.dragomiralin.Command.Receiver.Light;
import com.dragomiralin.Facade.Message;
import com.dragomiralin.Facade.Upload;
import com.dragomiralin.Observer.BusyService;
import com.dragomiralin.Observer.ChildrenService;
import com.dragomiralin.Observer.HistoryMessage;
import com.dragomiralin.Strategy.FirstNameStrategy;
import com.dragomiralin.Strategy.LastNameStrategy;
import com.dragomiralin.Strategy.MyPresentation;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        // Command
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        AudioSystem audioSystem = new AudioSystem();

        control.executeCommand(new TurnON(light));
        control.executeCommand(new TurnOFF(light));
        control.executeCommand(new TurnVolumeUP(audioSystem));
        control.executeCommand(new GetState(audioSystem));

        // Strategy
        MyPresentation myPresentation = new MyPresentation();
        myPresentation.setNameStrategy(new LastNameStrategy());
        myPresentation.myNameIs("Alin", "Dragomir");

        //  Facade
        Message message = new Message();
        Upload upload = new Upload();
        message.sendMessage("http://192.168.99.100","Hello World");
        upload.uploadFile("http://192.168.99.102", "video.mp4");

    }
}
