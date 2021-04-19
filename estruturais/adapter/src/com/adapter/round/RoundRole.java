package com.adapter.round;

public class RoundRole {

    private double radius;

    public RoundRole(float radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
