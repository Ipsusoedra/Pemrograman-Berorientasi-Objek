/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarError.Program;

import com.StripBandunk.BelajarError.Data.Buah;

/**
 *
 * @author iipsu
 */
public class ProgramBuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buah a = new Buah();
        a.nama = "Apel";
        a.biji = 5;
        tampil(a);
    }
    public static void tampil(Buah buah){
    System.out.println("Nama : " + buah.nama);
    System.out.println("Biji : " + buah.biji);
    }
    
}
