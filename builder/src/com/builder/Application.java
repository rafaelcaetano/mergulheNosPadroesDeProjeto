package com.builder;

import com.builder.builder.impl.CarBuilder;
import com.builder.builder.impl.ManualBuilder;
import com.builder.builder.impl.diretor.Diretor;
import com.builder.product.Car;
import com.builder.product.Manual;

public class Application {

    private Diretor diretor = new Diretor();

    public void makeCar() {
        CarBuilder builder = new CarBuilder();
        diretor.constructSportCars(builder);
        Car car = builder.getProduct();

        ManualBuilder manualBuilder = new ManualBuilder();
        diretor.constructSportCars(manualBuilder);
        Manual manual = manualBuilder.getProduct();

    }



}
