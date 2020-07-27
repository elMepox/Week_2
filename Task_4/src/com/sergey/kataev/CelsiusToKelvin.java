package com.sergey.kataev;

public class CelsiusToKelvin implements BaseConverter {
    public CelsiusToKelvin() {
    }

    @Override
    public double convert(double value) {
        return value+273.15;
    }
}
