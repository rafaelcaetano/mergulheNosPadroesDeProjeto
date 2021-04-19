package com.bridge.implementation.impl;

import com.bridge.implementation.Device;

public class Radio implements Device {

    private int vol;
    private int channel;
    private boolean enable;

    @Override
    public boolean isEnabled() {
        System.out.println("The tv is" + (enable?" ":" not ") + "enable");
        return enable;
    }

    @Override
    public void enable() {
        System.out.println("Enable radio");
        this.enable = true;
    }

    @Override
    public void disable() {
        System.out.println("Disable radio");
        this.enable = false;
    }

    @Override
    public int getVol() {
        System.out.println("The vol of radio is: " + vol + "%");
        return this.vol;
    }

    @Override
    public void setVol(int percent) {
        System.out.println("Set vol of radio for " + percent + "%");
        this.vol = percent;
    }

    @Override
    public int getChanel() {
        System.out.println("The radio is in channel: " + channel);
        return channel;
    }

    @Override
    public void setChanel(int channel) {
        System.out.println("Set radio channel to: " + channel);
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "vol=" + vol +
                ", channel=" + channel +
                ", enable=" + enable +
                '}';
    }
}
