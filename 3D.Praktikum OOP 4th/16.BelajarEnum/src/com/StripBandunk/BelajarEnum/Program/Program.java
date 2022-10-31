/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarEnum.Program;

import com.StripBandunk.BelajarEnum.Data.Orang;
import com.StripBandunk.BelajarEnum.Data.JenisKelamin;

/**
 *
 * @author iipsu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang a = new Orang();
        a.nama = "Eko";
        a.jenisKelamin = JenisKelamin.Pria ;
        a.alamat = "Subang";
        
        a.tampilInformasi();
        
    }
    
}
