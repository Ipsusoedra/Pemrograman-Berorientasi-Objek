/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarToString.Program;

import com.StripBandunk.BelajarToString.Data.Manusia;

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
        Manusia m = new Manusia();
        m.setNama("Eko");
        m.setJenisKelamin("Pria");
        m.setAlamat("Subang");
        
        System.out.println(m);
    }
    
}
