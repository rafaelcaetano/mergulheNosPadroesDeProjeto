package com.composite.impl;

public class Retangle extends Dot {

    private int h;
    private int l;

    public Retangle(int x, int y, int h, int l) {
        super(x, y);
        this.h = h;
        this.l = l;
    }


    @Override
    public void draw() {
        System.out.println("Desenha um retangulo em x: " + super.getX() + " y: "
                + super.getY() + " com largura: " + this.l + " e com altura: " + this.h);
    }

    public int getH() {
        return h;
    }

    public int getL() {
        return l;
    }
}
