/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMembuatKelasGeneric.Program;

import com.StripBandunk.BelajarMembuatKelasGeneric.Data.Data;

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
        Data<String> a = new Data<String>();
        a.setData("Eko");
        System.out.println(a.getData());
        
        Data<Integer> b = new Data<Integer>();
        b.setData(10);
        System.out.println(b.getData());
        
        Data<Double> c = new Data<>();
        c.setData(10.0);
        System.out.println(c.getData());
    }
    
}
