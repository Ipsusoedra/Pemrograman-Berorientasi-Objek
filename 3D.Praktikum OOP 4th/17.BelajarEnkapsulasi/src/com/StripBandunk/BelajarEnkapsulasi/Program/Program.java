/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarEnkapsulasi.Program;

import com.StripBandunk.BelajarEnkapsulasi.Data.Orang;

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
        a.ubahNama(null);
        System.out.println(a.tanyaNama());
    }
    
}
