/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMembuatMetodeGeneric.Program;

import com.StripBandunk.BelajarMembuatMetodeGeneric.Util.ArrayUtil;

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
        String[] array = new String[]{
        "Eko","Kurniawan","Khannedy"
        };
        
        String tengah = ArrayUtil.<String>ambilTengah(array);
        System.out.println(tengah);
        
        Integer[] array2 = new Integer[]{
        10,20,30
        };
        
        Integer tengah2 = ArrayUtil.<Integer>ambilTengah(array2);
        System.out.println(tengah2);
    }
    
}
