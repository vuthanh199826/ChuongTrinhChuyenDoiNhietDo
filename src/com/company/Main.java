package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. exit");
            choice = sc.nextInt();
            double c;
            double f;
            switch (choice) {
                case 1:
                    System.out.println("nhap do F vao day");
                    f = sc.nextInt();
                    c = (5.0 / 9) * (f - 32);
                    System.out.println(c);
                    break;
                case 2:
                    System.out.println("nhap do C vao day");
                    c = sc.nextInt();
                    f = (9.0 / 5) * c + 32;
                    System.out.println(f);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("nhap lai");
            }
        }
    }
}
