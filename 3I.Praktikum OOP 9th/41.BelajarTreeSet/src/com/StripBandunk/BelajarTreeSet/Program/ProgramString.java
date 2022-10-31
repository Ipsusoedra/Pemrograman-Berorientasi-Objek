/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarTreeSet.Program;

import com.StripBandunk.BelajarTreeSet.Comparator.StringDescendingComparator;
import java.util.TreeSet;

/**
 *
 * @author iipsu
 */
public class ProgramString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TreeSet<String> set = new TreeSet<>(new StringDescendingComparator());
        
        set.add("Eko");
        set.add("Kurniawan");
        set.add("Khannedy");
        set.add("Joko");
        set.add("Moro");
        set.add("Adhitya");
        set.add("Yudha");
        set.add("Pradana");
        
        set.remove("Eko");
        
        for(String value : set){
        System.out.println(value);
        }
    }
    
}
