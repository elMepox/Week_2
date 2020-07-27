package com.sergey.kataev;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI*Math.pow(radius,2)*height, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Тип фигуры: ").append("Цилиндр\n")
                .append("R := ")
                .append(this.getRadius())
                .append("\n")
                .append("H := ")
                .append(this.height)
                .append("\n")
                .append("Volume := ")
                .append(this.getVolume())
                .append("\n");
        return builder.toString();
    }
}
