/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author ongki
 */
public class matematika {
    
    //pertambahan
    int hasilInt;
    double hasilDouble;

    //  overload pertambahan
    void pertambahan(double a, double b, double c) {
        hasilDouble = a + b + c;
        System.out.printf("Hasil pertambahan: %.1f%n", hasilDouble);
    }

    void pertambahan(int a, int b, int c) {
        hasilInt = a + b + c;
        System.out.println("Hasil pertambahan : " + hasilInt);
    }

    void pertambahan(int a, int b) {
        hasilInt = a + b;
        System.out.println("Hasil pertambahan : " + hasilInt);
    }

    void pertambahan(double a, double b) {
        hasilDouble = a + b;
        System.out.printf("Hasil pertambahan: %.1f%n", hasilDouble);
    }

    //  overload pengurangan
    void pengurangan(double a, double b, double c) {
        hasilDouble = a - b - c;
        System.out.println("Hasil pengurangan : " + hasilDouble);
    }

    void pengurangan(int a, int b, int c) {
        hasilInt = a - b - c;
        System.out.println("Hasil pengurangan : " + hasilInt);
    }

    void pengurangan(int a, int b) {
        hasilInt = a - b;
        System.out.println("Hasil pengurangan : " + hasilInt);
    }

    void pengurangan(double a, double b) {
        hasilDouble = a - b;
        System.out.printf("Hasil pengurangan: %.1f%n", hasilDouble);
    }

        //  overload perkalian
    void perkalian(double a, double b, double c) {
        hasilDouble = a * b * c;
        System.out.println("Hasil perkalian : " + hasilDouble);
    }

    void perkalian(int a, int b, int c) {
        hasilInt = a * b * c;
        System.out.println("Hasil perkalian : " + hasilInt);
    }

    void perkalian(int a, int b) {
        hasilInt = a * b;
        System.out.println("Hasil perkalian : " + hasilInt);
    }

    void perkalian(double a, double b) {
        hasilDouble = a * b;
        System.out.println("Hasil perkalian : " + hasilDouble);
    }

        //  overload pembagian
    void pembagian(double a, double b, double c) {
        hasilDouble = a / b / c;
        System.out.printf("Hasil pertambahan: %.11f%n", hasilDouble);
    }

    void pembagian(int a, int b, int c) {
        hasilInt = a / b / c;
        System.out.println("Hasil pembagian : " + hasilInt);
    }

    void pembagian(int a, int b) {
        hasilInt = a / b;
        System.out.println("Hasil pembagian : " + hasilInt);
    }

    void pembagian(double a, double b) {
        hasilDouble = a / b;
        System.out.printf("Hasil pertambahan: %.11f%n", hasilDouble);
    }

    
    
}
