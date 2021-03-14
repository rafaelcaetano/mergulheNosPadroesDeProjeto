package com.builder.builder;

import com.builder.engine.Engine;

public interface Builder {
    void reset();
    void setSeats(int numSeats);
    void setEngine(Engine engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
