package com.bridge;

import com.bridge.abstraction.RemoteControl;
import com.bridge.implementation.Device;
import com.bridge.implementation.impl.Radio;
import com.bridge.implementation.impl.Tv;

public class Application {
    public static void main(String[] args) {

        System.out.println("Comandos da tv:");
        Device tv = new Tv();
        RemoteControl remoteControlTv = new RemoteControl(tv);
        remoteControlTv.togglePower();
        remoteControlTv.volumeUp();
        remoteControlTv.volumeUp();
        remoteControlTv.volumeUp();
        remoteControlTv.chennelUp();
        remoteControlTv.chennelUp();
        remoteControlTv.togglePower();
        System.out.println(tv.toString());

        System.out.println("\n\n");

        System.out.println("Comandos do radio:");
        Device radio = new Radio();
        RemoteControl remoteControlRadio = new RemoteControl(radio);
        remoteControlRadio.togglePower();
        remoteControlRadio.volumeUp();
        remoteControlRadio.volumeUp();
        remoteControlRadio.volumeUp();
        remoteControlRadio.volumeUp();
        remoteControlRadio.chennelUp();
        remoteControlRadio.chennelUp();
        remoteControlRadio.chennelUp();
        remoteControlRadio.chennelUp();
        remoteControlRadio.togglePower();
        System.out.println(radio.toString());
    }
}
