/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarHashCode.Program;

import com.StripBandunk.BelajarHashCode.Data.Buah;

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
        Buah buah1 = new Buah();
        buah1.nama = "Apel";
        buah1.Biji = 5;
        buah1.banyak = 10;
        
        Buah buah2 = new Buah();
        buah2.nama = "Jeruk";
        buah2.Biji = 5;
        buah2.banyak = 10;
        
        if(buah1 .equals(buah2)){
        System.out.println("Sama");
        System.out.println("Hashcode buah1 : " + buah1.hashCode());
        System.out.println("Hashcode buah2 : " + buah2.hashCode());
        }else{
        System.out.println("Beda");
        System.out.println("Hashcode buah1 : " + buah1.hashCode());
        System.out.println("Hashcode buah2 : " + buah2.hashCode());
        
        }
        
    }
    
}
