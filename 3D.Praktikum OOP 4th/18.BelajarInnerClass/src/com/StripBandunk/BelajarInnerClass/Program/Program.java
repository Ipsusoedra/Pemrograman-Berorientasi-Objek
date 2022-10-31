/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarInnerClass.Program;

import com.StripBandunk.BelajarInnerClass.Data.Mobil;

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
        Mobil.Motor b = new Mobil.Motor();
        b.setNama("Honda");
        
        System.out.println("Nama : " + b.getNama());
        
    }
    
}
