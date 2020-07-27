package com.sergey.kataev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final double maxValue = 10;
    private static double mean(double[] arr){
        int sum = 0;
        double n = arr.length;
        for (double i :
                arr) {
            sum += i;
        }
        return sum/n;
    }
    private static double max(double[] arr){
        double m = arr[0];
        for (double i :
                arr) {
            if(m < i){
                m = i;
            }
        }
        return m;
    }
    private static double min(double[] arr){
        double m = arr[0];
        for (double i :
                arr) {
            if(m > i){
                m = i;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        System.out.print("n := ");
        n = scanner.nextInt();
        double[] arr = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextDouble()*maxValue;
        }
        System.out.println("Среднее = "+mean(arr));
        System.out.println("Минимальный элемент = "+min(arr));
        System.out.println("Максимальный элемент = "+max(arr));
        System.out.println("Содержимое массива");
        for (double i :
                arr) {
            System.out.println(i);
        }

    }
}
