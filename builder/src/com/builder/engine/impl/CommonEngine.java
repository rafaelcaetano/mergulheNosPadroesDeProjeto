package com.builder.engine.impl;

import com.builder.engine.Engine;

public class CommonEngine implements Engine {

    private final String name;

    public CommonEngine() {
        this.name = "Common engine";
    }

    @Override
    public String getName() {
        return name;
    }
}
