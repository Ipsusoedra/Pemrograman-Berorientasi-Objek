/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMetodeAbstrak.Program;

import com.StripBandunk.BelajarMetodeAbstrak.Data.Granat;
import com.StripBandunk.BelajarMetodeAbstrak.Data.Pistol;
import com.StripBandunk.BelajarMetodeAbstrak.Data.Tentara;

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
        Tentara tentara = new Tentara();
        tentara.setSenjata1(new Pistol());
        tentara.setSenjata2(new Granat());
        
        tentara.serang();
    }
    
}
