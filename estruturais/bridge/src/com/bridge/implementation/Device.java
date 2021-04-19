package com.bridge.implementation;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVol();
    void setVol(int percent);
    int getChanel();
    void setChanel(int channel);
}
