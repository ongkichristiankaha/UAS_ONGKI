/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bank;

/**
 *
 * @author ongki
 */
public class Bank {
    public int saldo;

    public Bank(int saldoAwal) {
        saldo = saldoAwal; 
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;  
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah; 
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        }
    }

}
