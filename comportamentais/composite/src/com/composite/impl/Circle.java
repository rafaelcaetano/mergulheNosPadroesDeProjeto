package com.composite.impl;

public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Desenha um circulo em x: " + super.getX() + " y: " + super.getY() + " e com raio: " + this.radius);
    }

    public int getRadius() {
        return radius;
    }
}
