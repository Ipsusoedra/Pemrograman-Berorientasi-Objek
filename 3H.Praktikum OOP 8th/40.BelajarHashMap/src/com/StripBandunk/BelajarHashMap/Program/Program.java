/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarHashMap.Program;

import java.util.HashMap;
import java.util.Set;

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
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Eko");
        map.put(2, "Kurniawan");
        map.put(3, "Khannedy");
        
        map.remove(2);
        
        String value = map.get(3);
        System.out.println(map.size());
        System.out.println(value);
        
        Set<Integer> set = map.keySet();
        for(Integer value2 : set){
        System.out.println(value2);
        }
        
        for(String value3 : map.values()){
        System.out.println(value3);
        }
        
        
        
    }
    
}
