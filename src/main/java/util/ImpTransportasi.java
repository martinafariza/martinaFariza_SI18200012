/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import Data.Kendaraan;

/**
 *
 * @author USER
 */
public class ImpTransportasi implements Transportasi {
    Kendaraan kd = new Kendaraan();

    @Override
    public void insert() {
        kd.setJenis("Roda Dua"); // Menggunakan setter untuk mengatur jenis kendaraan
        kd.setMerk("Honda Scoopy"); // Menggunakan setter untuk mengatur merk kendaraan
        kd.setFeul("PERTAMAX TURBO"); // Menggunakan setter untuk mengatur bahan bakar kendaraan
    }

    @Override
    public void tampil() {
        // Menampilkan informasi kendaraan
        System.out.println("Jenis: " + kd.getJenis());
        System.out.println("Merk: " + kd.getMerk());
        System.out.println("Bahan Bakar: " + kd.getFeul());
    }
}

