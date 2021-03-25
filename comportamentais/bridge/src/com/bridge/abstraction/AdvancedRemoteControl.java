package com.bridge.abstraction;

import com.bridge.implementation.Device;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVol(0);
    }
}
