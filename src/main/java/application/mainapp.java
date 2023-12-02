/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
import Data.Karyawan;
import Data.Kendaraan;
import Data.Perusahaan;
import util.ImpTransportasi;
/**
 *
 * @author USER
 */
public class mainapp {
    public static void main(String[] args){
        var p =  new Perusahaan();
        p.name = "SEJAHTERA";
        p.bidang_usaha = "Garmen";
        System.out.println("Nama Perusahaan = "+ p.name);
        System.out.println("Bidang Usaha = "+ p.bidang_usaha);
        var k = new Karyawan();
        k.setId(111022);
        k.setName("Martina Fariza");
        k.setAlamat("lingkungan prapen, praya");
        System.out.println("id = " + k.getId());
        System.out.println("Nama = " + k.getName());
        System.out.println("Alamat = " + k.getAlamat());
        
        Perusahaan.Jabatan j = p.new Jabatan();
        j.setJBT_karyawan("Manager");
        j.setBidang("Marketing");
        System.out.println("Jabatan = " + j.getJBT_karyawan());
        System.out.println("Bidang Pekerjaan = " + j.gettBidang());
        
        var t = new ImpTransportasi();
        t.insert();
        t.tampil();
        
        
        
    }
}
