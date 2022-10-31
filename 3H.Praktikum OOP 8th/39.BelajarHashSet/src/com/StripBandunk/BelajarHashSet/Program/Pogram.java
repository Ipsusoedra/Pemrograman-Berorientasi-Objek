/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarHashSet.Program;

import java.util.HashSet;

/**
 *
 * @author iipsu
 */
public class Pogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> set = new HashSet<String>();
        set.add("Eko");
        set.add("Eko");
        set.add("Kurniawan");
        set.add("Kurniawan");
        set.add("Kurniawan");
        set.add("Khannedy");
        
        for (String value : set){
        System.out.println(value);
        }
    }
    
}
