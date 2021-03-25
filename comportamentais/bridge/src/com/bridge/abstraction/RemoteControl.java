package com.bridge.abstraction;

import com.bridge.implementation.Device;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVol(device.getVol() - 10);
    }

    public void volumeUp() {
        device.setVol(device.getVol() + 10);
    }

    public void channelDown() {
        device.setChanel(device.getChanel() - 1);
    }

    public void chennelUp() {
        device.setChanel(device.getChanel() + 1);
    }
}
