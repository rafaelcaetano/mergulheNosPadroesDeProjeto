package com.builder.builder.impl;

import com.builder.builder.Builder;
import com.builder.engine.Engine;
import com.builder.product.Car;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int numSeats) {
        System.out.println("Numeros de assentos no carro: " + numSeats);
    }

    @Override
    public void setEngine(Engine engine) {
        System.out.println("Tipo de motor" + engine.getName());
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        System.out.println("Tem computador de bordo: " + (hasTripComputer ? "sim" : "nao") );
    }

    @Override
    public void setGPS(boolean hasGPS) {
        System.out.println("Tem GPS: " + (hasGPS ? "sim" : "nao"));
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }

}
