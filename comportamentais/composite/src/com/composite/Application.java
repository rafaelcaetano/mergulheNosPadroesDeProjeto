package com.composite;

import com.composite.impl.Circle;
import com.composite.impl.CompoundGraphic;
import com.composite.impl.Dot;
import com.composite.impl.Retangle;

public class Application {
    public static void main(String[] args) {

        Graphic dot = new Dot(2, 3);
        Circle circle = new Circle(5, 6, 10);
        Retangle retangle = new Retangle(7, 8, 12, 8);

        CompoundGraphic compoundGraphic1 = new CompoundGraphic();
        compoundGraphic1.add(retangle);

        CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.add(dot);
        compoundGraphic.add(circle);
        compoundGraphic.add(compoundGraphic1);

        compoundGraphic.draw();
    }
}
