/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.BelajarVisibilityProtected.Program;

import com.BelajarVisibilityProtected.Data.Karyawan;
import com.BelajarVisibilityProtected.Data.Orang;

/**
 *
 * @author iipsu
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang a = new Orang();
        a.setNama("Eko");
        a.setAlamat("Subang"); 
        
        System.out.println(a.getNama());
        System.out.println(a.getAlamat());
        
        Karyawan b = new Karyawan();
        b.setNama("Eko");
        b.setAlamat("Subang"); 
        
        b.tampilInformasi();
    }
    
}
