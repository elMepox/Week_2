package com.sergey.kataev;

import java.util.Random;

public class Vector {
    private double x, y, z;
    private static final double maxValue = 10;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lenght() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double scolarMultiplication(Vector v2) {
        Vector v1 = this;
        return (v1.x * v2.x + v1.y * v2.y + v1.z * v2.z);
    }

    public Vector vectorMultiplication(Vector v2) {
        double x1 = this.x;
        double y1 = this.y;
        double z1 = this.z;

        double x2 = v2.x;
        double y2 = v2.y;
        double z2 = v2.z;

        double x3 = y1 * z2 - z1 * y2;
        double y3 = z1 * x2 - x1 * z2;
        double z3 = x1 * y2 - y1 * x2;

        return new Vector(x3, y3, z3);
    }

    public double getCosAlpha(Vector v2) {
        Vector v1 = this;
        return v1.scolarMultiplication(v2) / (v1.lenght() * v2.lenght());
    }

    public Vector sum(Vector v2) {
        Vector v1 = this;
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public Vector difference(Vector v2) {
        Vector v1 = this;
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector[] generateNVectors(int n) {
        Vector[] vectors = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble() * maxValue;
            double y = random.nextDouble() * maxValue;
            double z = random.nextDouble() * maxValue;
            vectors[i] = new Vector(x, y, z);
        }
        return vectors;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
