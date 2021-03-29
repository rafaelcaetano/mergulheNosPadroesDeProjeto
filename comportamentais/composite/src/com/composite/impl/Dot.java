package com.composite.impl;

import com.composite.Graphic;

public class Dot implements Graphic {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Desenha um ponto em x: " + this.x + " y: " + this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
