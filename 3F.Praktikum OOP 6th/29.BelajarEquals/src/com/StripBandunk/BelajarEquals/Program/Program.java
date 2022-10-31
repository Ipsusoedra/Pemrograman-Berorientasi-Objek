/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarEquals.Program;

import com.StripBandunk.BelajarEquals.Data.Contoh;

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
        Contoh contoh1 = new Contoh();
        contoh1.nama="Eko";
        Contoh contoh2 = new Contoh();
        contoh2.nama="Eko K";
        
        if(contoh1.equals(contoh2)){
        System.out.println("Sama");
        }else{
        System.out.println("Beda");
        }
        
    }
    
}
