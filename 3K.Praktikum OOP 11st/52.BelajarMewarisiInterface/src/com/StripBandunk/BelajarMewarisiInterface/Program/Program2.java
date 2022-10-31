/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMewarisiInterface.Program;

import com.StripBandunk.BelajarMewarisiInterface.Data.Makan;

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
        Makan m = new Makan() {
            @Override
            public void makan() {
            System.out.println("Makan! Kelas tanpa nama");
            }
        };
        
        m.makan();
    }
    
}
