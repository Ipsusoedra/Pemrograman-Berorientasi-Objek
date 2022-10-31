/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.StripBandunk.Visibility.Program;
import com.StripBandunk.Visibility.Data.Dosen;
/**
 *
 * @author hp
 */
public class ContohProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Kelas Dosen memiliki visibility default
        Dosen a = new Dosen();
        a.nip = "12471824";
        a.nama = "Eko";
        a.alamat = "Subang";
        
        a.tampilInformasi();
    }
    
}
