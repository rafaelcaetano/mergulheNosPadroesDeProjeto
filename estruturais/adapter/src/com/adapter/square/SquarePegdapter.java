package com.adapter.square;

import com.adapter.round.RoundPeg;

public class SquarePegdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
