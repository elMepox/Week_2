package com.sergey.kataev;

import java.util.LinkedList;

public class Box extends Shape {
    private LinkedList<Shape> shapes;
    private double currentVolume;
    public Box(double volume) {
        super(volume);
        shapes = new LinkedList<>();
        currentVolume = 0;
    }
    public boolean add(Shape shape){
        if (this.currentVolume+shape.getVolume() <= this.getVolume()){
            shapes.add(shape);
            this.currentVolume += shape.getVolume();
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Shape i :
                this.shapes) {
            builder.append(i.toString());
        }
        return builder.toString();
    }
}
