package com.prototype;

import com.prototype.shape.Circle;
import com.prototype.shape.Retangle;
import com.prototype.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle =  new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Retangle retangle = new Retangle();
        retangle.setWidth(10);
        retangle.setHeight(20);
        shapes.add(retangle);
    }

    public void business() {

        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape: shapes) {
            shapesCopy.add(shape);
        }

        System.out.println("Lista original:");
        System.out.println(shapes.toString());

        System.out.println("Lista copia:");
        System.out.println(shapesCopy.toString());

    }


}
