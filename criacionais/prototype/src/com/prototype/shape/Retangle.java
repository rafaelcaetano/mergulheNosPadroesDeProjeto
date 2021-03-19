package com.prototype.shape;

public class Retangle extends Shape {

    private int width;
    private int height;

    public Retangle() {

    }

    public Retangle(Retangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Retangle(this);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
