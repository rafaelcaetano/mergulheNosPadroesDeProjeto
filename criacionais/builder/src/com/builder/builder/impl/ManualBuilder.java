package com.builder.builder.impl;

import com.builder.builder.Builder;
import com.builder.engine.Engine;
import com.builder.product.Manual;

public class ManualBuilder implements Builder {

    private Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int numSeats) {
        System.out.println("Documenta as funcionalidades dos assentos do carro");
    }

    @Override
    public void setEngine(Engine engine) {
        System.out.println("Adiciona as instruções do motor do tipo: " + engine.getName());
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        System.out.println("Instruções do computador de bordo.");
    }

    @Override
    public void setGPS(boolean hasGPS) {
        System.out.println("instruções do GPS");
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }

}
