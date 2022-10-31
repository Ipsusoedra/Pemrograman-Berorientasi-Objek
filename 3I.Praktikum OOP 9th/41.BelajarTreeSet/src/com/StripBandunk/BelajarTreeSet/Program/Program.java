/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarTreeSet.Program;

import java.util.TreeSet;

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
        TreeSet<Integer> set = new TreeSet<Integer>();
        
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(4);
        set.add(3);
        set.add(5);
        
        set.remove(5);
        
        for(Integer value : set){
        System.out.println(value);
        }
    }
    
}
