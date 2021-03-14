package com.builder.builder.impl.diretor;

import com.builder.builder.Builder;
import com.builder.engine.impl.CommonEngine;
import com.builder.engine.impl.SportEngine;

public class Diretor {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportCars(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUVCars(Builder builder) {
        builder.reset();
        builder.setSeats(7);
        builder.setEngine(new CommonEngine());
        builder.setTripComputer(true);
        builder.setGPS(false);
    }

}
