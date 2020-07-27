package com.sergey.kataev;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(Math.pow(radius,3)*Math.PI*4/3, radius);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Тип фигуры: ").append("Сфера\n")
                .append("R := ")
                .append(this.getRadius())
                .append("\n")
                .append("Volume := ")
                .append(this.getVolume())
                .append("\n");
        return builder.toString();
    }
}
