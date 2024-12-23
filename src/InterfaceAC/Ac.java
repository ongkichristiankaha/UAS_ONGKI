/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author ongki
 */
public class Ac implements InterfaceAC {
    public int statusAC;

    public Ac() {
        statusAC = KEADAAN_MATI; // Default AC dalam keadaan mati
    }

    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("AC Hidupkan! --> AC sudah hidup.");
        } else {
            System.out.println("AC Hidupkan! --> AC sudah hidup, tidak perlu dihidupkan lagi.");
        }
    }

    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("AC Matikan! --> AC sudah mati.");
        } else {
            System.out.println("AC Matikan! --> AC sudah mati, tidak perlu dimatikan lagi.");
        }
    }

    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            System.out.println("AC Dinginkan! --> AC sedang mendinginkan ruangan.");
        } else {
            System.out.println("AC Dinginkan! --> AC belum hidup, tidak bisa mendinginkan.");
        }
    }

    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            System.out.println("AC Panaskan! --> AC sedang memanaskan ruangan.");
        } else {
            System.out.println("AC Panaskan! --> AC belum hidup, tidak bisa memanaskan.");
        }
    }
}
