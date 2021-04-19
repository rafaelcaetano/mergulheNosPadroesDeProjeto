package com.bridge.implementation.impl;

import com.bridge.implementation.Device;

public class Tv implements Device {

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
        System.out.println("Enable tv");
        this.enable = true;
    }

    @Override
    public void disable() {
        System.out.println("Disable tv");
        this.enable = false;
    }

    @Override
    public int getVol() {
        System.out.println("The vol of tv is: " + vol + "%");
        return this.vol;
    }

    @Override
    public void setVol(int percent) {
        System.out.println("Set vol of tv for " + percent + "%");
        this.vol = percent;
    }

    @Override
    public int getChanel() {
        System.out.println("The tv is in channel: " + channel);
        return channel;
    }

    @Override
    public void setChanel(int channel) {
        System.out.println("Set tv channel to: " + channel);
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "vol=" + vol +
                ", channel=" + channel +
                ", enable=" + enable +
                '}';
    }
}
