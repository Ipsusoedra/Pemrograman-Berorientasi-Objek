/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarArrayList.Program;

import java.util.ArrayList;

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
        ArrayList<String> array = new ArrayList<String>();
        array.add("Eko");
        array.add("Kurniawan");
        array.add("Khannedy");
        int panjang = array.size();
        
        System.out.println(panjang);
        
        array.remove(0);
        panjang = array.size();
        System.out.println(panjang);
        
        array.set(1, "Iip Sudrajat");
        System.out.println(array.get(1));
        
        for(String value : array){
        System.out.println(value);
        }
        
        
        
    }
    
}
