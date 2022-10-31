/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarKonversiKelas.Program;

import com.StripBandunk.BelajarKonversiKelas.Data.Karyawan;
import com.StripBandunk.BelajarKonversiKelas.Data.Mahasiswa;
import com.StripBandunk.BelajarKonversiKelas.Data.Manusia;

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
        Manusia m = new Karyawan();
        Karyawan k = (Karyawan) m;
        k.karyawan();
        
        Manusia ma = new Mahasiswa();
        
        if(ma instanceof Karyawan){
        Karyawan ka = (Karyawan) ma;
        ka.karyawan();
        }else if(ma instanceof Mahasiswa){
        Mahasiswa mah = (Mahasiswa) ma;
        mah.mahasiswa();
        }
    }
    
}
