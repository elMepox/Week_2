package com.sergey.kataev;

public class CelsiusToFahrenheit implements BaseConverter{
    public CelsiusToFahrenheit() {
    }

    @Override
    public double convert(double value) {
        return value*9/5 + 32;
    }
}
