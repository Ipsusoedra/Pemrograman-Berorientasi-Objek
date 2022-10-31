/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.StripBandunk.BelajarVisibilityPublic.Program;
import com.StripBandunk.BelajarVisibilityPublic.Data.mataKuliah;
/**
 *
 * @author hp
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mataKuliah a = new mataKuliah();
        a.kode = "IF0052";
        a.nama = "Interaksi Manusia dan Komputer";
        a.sks = 3;
        
        a.tampilInformasi();
    }
    
}
