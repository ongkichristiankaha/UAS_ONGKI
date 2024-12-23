/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author ongki
 */

import java.util.Scanner;
public class BMIkalkulatorBeraksi {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Selamat Datang di Program      ");
        System.out.println("      Penghitungan Indeks Massa   ");
        System.out.println("           Tubuh (BMI)            ");
        System.out.println("===================================\n");
        
         boolean lanjut;
        do {
            System.out.print("Masukkan berat badan (kg): ");
            double beratBadan = scanner.nextDouble();

            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggiBadan = scanner.nextDouble();
      

            BMIkalkulator bmiHitung = new BMIkalkulator(beratBadan, tinggiBadan);

            double bmi = bmiHitung.hitungBMI();
            String kategori = bmiHitung.kategoriBMI(bmi);

            System.out.printf("\nIndeks Massa Tubuh (BMI) Anda: %.1f%n", bmi);
            System.out.println("Kategori: " + kategori);

            System.out.print("\nApakah Anda ingin menghitung lagi? (ya/tidak): ");
            String response = scanner.next().toLowerCase();
            lanjut = response.equals("ya");

        } while (lanjut);

        System.out.println("\nTerima kasih telah menggunakan program ini!");
        scanner.close();
    }
}
