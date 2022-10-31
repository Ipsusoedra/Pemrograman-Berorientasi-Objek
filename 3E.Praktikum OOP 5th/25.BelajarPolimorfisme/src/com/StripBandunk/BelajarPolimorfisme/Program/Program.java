/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarPolimorfisme.Program;

import com.StripBandunk.BelajarPolimorfisme.Data.Dosen;
import com.StripBandunk.BelajarPolimorfisme.Data.Mahasiswa;
import com.StripBandunk.BelajarPolimorfisme.Data.Manusia;
import com.StripBandunk.BelajarPolimorfisme.Data.Tampil;

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
        Manusia m = new Dosen();
        m.tampilInfo();
        
        Manusia ma = new Manusia();
        ma.setNama("Eko");
        ma.setAlamat("Subang");
        
        Tampil.tampil(ma);
        
    }
    
}
