/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author ongki
 */
public class BMIkalkulator {
     double beratBadan;
     double tinggiBadan;
    
    public BMIkalkulator(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan / 100;
    }
    
     public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String kategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 26.9) {
            return "Kelebihan Berat Badan";
        } else if (bmi < 27.5){
            return "Berat Berlebihan";
        } else {
            return "Obesitas";
        }
    }
}
