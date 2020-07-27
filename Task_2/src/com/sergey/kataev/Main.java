package com.sergey.kataev;

import java.io.Writer;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вектор 1");
        System.out.print("x1 := ");
        double x = scanner.nextDouble();
        System.out.print("y1 := ");
        double y = scanner.nextDouble();
        System.out.print("z1 := ");
        double z = scanner.nextDouble();
        Vector v1 = new Vector(x,y,z);
        System.out.println("Введенный вектор:");
        System.out.println(vectorToString(v1));

        System.out.println("Введите вектор 2");
        System.out.print("x2 := ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 := ");
        double y2 = scanner.nextDouble();
        System.out.print("z2 := ");
        double z2 = scanner.nextDouble();
        Vector v2 = new Vector(x2,y2,z2);

        System.out.println("Длинна вектора 1:");
        System.out.println(v1.lenght());

        System.out.println("Длинна вектора 2:");
        System.out.println(v2.lenght());

        System.out.println("Сколярное произведение векторов 1 и 2:");
        System.out.println(v1.scolarMultiplication(v2));

        System.out.println("Вектор, полученный в результате векторного произведения векторов 1 и 2:");
        System.out.println(vectorToString(v1.vectorMultiplication(v2)));

        System.out.println("Косинус угла между векторами 1 и 2:");
        System.out.println(v1.getCosAlpha(v2));

        System.out.println("Сумма векторов 1 и 2:");
        System.out.println(vectorToString(v1.sum(v2)));

        System.out.println("Разность векторов 1 и 2:");
        System.out.println(vectorToString(v1.difference(v2)));

        System.out.println("Введите n");
        int n = scanner.nextInt();

        Vector[] vectors = Vector.generateNVectors(n);
        System.out.println("Полученные n векторов:");
        for (Vector i :
                vectors) {
            System.out.println(vectorToString(i));

        }

    }
    private static String vectorToString(Vector vector) {
        return "(" + vector.getX() + ";" + vector.getY() + ";" + vector.getZ() + ")";
    }
}
