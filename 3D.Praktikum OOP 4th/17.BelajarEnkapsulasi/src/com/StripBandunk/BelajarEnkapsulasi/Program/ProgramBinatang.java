/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarEnkapsulasi.Program;

import com.StripBandunk.BelajarEnkapsulasi.Data.Binatang;

/**
 *
 * @author iipsu
 */
public class ProgramBinatang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Binatang a = new Binatang();
        a.setNama("Meong");
        a.setJenis("Kucing");
        a.setJumlahKaki(4);
        a.setJumlahTangan(0);
        a.setKawin(false);
        
        System.out.println("Nama : " + a.getNama());
        System.out.println("Jenis : " + a.getJenis());
        System.out.println("Jumlah Kaki : " + a.getJumlahKaki());
        System.out.println("Jumlah Tangan : " + a.getJumlahTangan());
        System.out.println("Kawin : " + a.isKawin());
    }
    
}
