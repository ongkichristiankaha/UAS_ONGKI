/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author ongki
 */
public class matematikaCanggih extends matematika  {
    
void modulus (double a, double b, double c){
        double hasil = a % b % c;
        System.out.println("HASIL MODULUS: "+ hasil);
    };
    
    void modulus(int a, int b){
        double hasil = a % b ;
        System.out.println("HASIL MODULUS: "+ hasil);
    };
    
    void modulus(int a, int b, int c ){
        double hasil = a % b % c ;
        System.out.println("HASIL MODULUS: "+ hasil);
    };
    
    void modulus(double a, double b ){
        double hasil = a % b  ;
        System.out.println("HASIL MODULUS: "+ hasil);
    };

    // Method operasiGabungan
    int operasiGabungan(int a , int b , int c){
        return a + (b * c);
    }
    
}
