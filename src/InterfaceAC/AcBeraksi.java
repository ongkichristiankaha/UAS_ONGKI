/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author ongki
 */
public class AcBeraksi {
    public static void main(String[] args) {
        Ac acKamar = new Ac();

        System.out.println("Status AC Saat Ini: Mati");

        acKamar.hidupkanAC();    
        acKamar.dinginkanAC();    
        acKamar.panaskanAC();     
        acKamar.matikanAC();      
        acKamar.matikanAC();      
        acKamar.hidupkanAC();    
    }
}
