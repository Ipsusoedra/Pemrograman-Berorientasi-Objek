/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarPolimorfismeParameter.Program;

import com.StripBandunk.BelajarPolimorfismeParameter.Data.Bazoka;
import com.StripBandunk.BelajarPolimorfismeParameter.Data.Senjata;
import com.StripBandunk.BelajarPolimorfismeParameter.Data.Tentara;

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
        Tentara a = new Tentara();
        a.setSenjata1(new Senjata());
        a.setSenjata2(new Bazoka());
        
        a.serang();
    }
    
}
