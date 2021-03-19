package com.factory.method.pattern.impl;

import com.factory.method.pattern.Button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("render windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Binds a SO click event.");
    }
}
