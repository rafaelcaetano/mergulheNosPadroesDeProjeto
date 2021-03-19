package com.abs.factory;

import com.abs.factory.pattern.factory.GUIFactory;
import com.abs.factory.pattern.factory.impl.MacFactory;
import com.abs.factory.pattern.factory.impl.WinFactory;

public class Main {

    private static GUIFactory factory;

    public static void main(String[] args) {

        factory = new WinFactory();
        Application winApp = new Application(factory);
        winApp.createUI();
        winApp.paint();

        System.out.println("===============================");

        factory = new MacFactory();
        Application macApp = new Application(factory);
        macApp.createUI();
        macApp.paint();

    }
}
