package com.sergey.kataev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите температуру:");
        System.out.print("С' = ");
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        CelsiusToFahrenheit fahrenheitConverter = new CelsiusToFahrenheit();
        CelsiusToKelvin kelvinConverter = new CelsiusToKelvin();
        System.out.println("температура в кельвинах = "+ kelvinConverter.convert(c));
        System.out.println("температура в фаренгейтах = "+ fahrenheitConverter.convert(c));
    }
}
