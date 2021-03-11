package com.factory.method;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a html button");
    }

    @Override
    public void onClick() {
        System.out.println("Binds a html click event");
    }
}
