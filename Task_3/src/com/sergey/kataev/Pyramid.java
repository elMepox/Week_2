package com.sergey.kataev;

public class Pyramid extends Shape {
    private double s,h;

    public Pyramid(double s, double h) {
        super(s*h/3);
        this.s = s;
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Тип фигуры: ").append("Пирамида\n")
                .append("S := ")
                .append(this.s)
                .append("\n")
                .append("H := ")
                .append(this.h)
                .append("\n")
                .append("Volume := ")
                .append(this.getVolume())
                .append("\n");
        return builder.toString();
    }
}
