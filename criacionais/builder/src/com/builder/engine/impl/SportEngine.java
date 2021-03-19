package com.builder.engine.impl;

import com.builder.engine.Engine;

public class SportEngine implements Engine {

    private final String name;

    public SportEngine() {
        this.name = "Sport engine";
    }

    @Override
    public String getName() {
        return name;
    }
}
