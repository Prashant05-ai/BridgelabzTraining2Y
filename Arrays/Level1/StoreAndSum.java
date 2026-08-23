package com.gla.IIstYear.Arrays.Level1;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == numbers.length) {
                break;
            }

            System.out.print("Enter a positive number (0 or negative to stop): ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum = " + total);
        sc.close();
    }
}
