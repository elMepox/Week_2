package com.sergey.kataev;

import java.util.Scanner;

public class Main {

    private static void addFigureMenu(Box box) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую фигуру добавить в коробку?");
        System.out.println("1)Цилиндр");
        System.out.println("2)Пирамиду");
        System.out.println("3)Сферу");
        System.out.print(": ");
        int choice = scanner.nextInt();
        double r = 0, h = 0, s = 0;
        switch (choice) {
            case 1:
                System.out.println("Введите данные финуры");
                System.out.print("r := ");
                r = scanner.nextDouble();
                System.out.print("h := ");
                h = scanner.nextDouble();
                if (box.add(new Cylinder(r,h))){
                    System.out.println("Фигура успешно добавлена в коробку");
                }
                else {
                    System.out.println("Невозможно добавить фигуру в коробку");
                }
                break;
            case 2:
                System.out.println("Введите данные финуры");
                System.out.print("s := ");
                s = scanner.nextDouble();
                System.out.print("h := ");
                h = scanner.nextDouble();
                if (box.add(new Pyramid(s,h))){
                    System.out.println("Фигура успешно добавлена в коробку");
                }
                else {
                    System.out.println("Невозможно добавить фигуру в коробку");
                }
                break;
            case 3:
                System.out.println("Введите данные финуры");
                System.out.print("r := ");
                r = scanner.nextDouble();
                if (box.add(new Ball(r))){
                    System.out.println("Фигура успешно добавлена в коробку");
                }
                else {
                    System.out.println("Невозможно добавить фигуру в коробку");
                }
                break;
            default:
                break;
        }
    }

    private static void printBoxShapes(Box box) {
        System.out.println("Содержимое коробки:");
        System.out.println(box.toString());
    }

    private static void menu(Box box) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Выберите действие: ");
            System.out.println("1) Добавить фигуру");
            System.out.println("2) Вывести содержимое коробки");
            System.out.println("0) Выйти из программы");
            System.out.print(": ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addFigureMenu(box);
                    break;
                case 2:
                    printBoxShapes(box);
                    break;
                default:
                    break;
            }
        } while (choice != 0);
        System.out.println("Завершение программы...");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем коробки: ");
        System.out.print("BoxVolume := ");
        double boxVolume = scanner.nextDouble();
        Box box = new Box(boxVolume);
        menu(box);
    }


}
