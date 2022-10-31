/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarOveriding.Program;

import com.StripBandunk.BelajarOveriding.Data.Child;
import com.StripBandunk.BelajarOveriding.Data.Parent;

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
        Child anak = new Child();
        anak.tampilInfo();
        anak.tampilInfoParent();
        
        Parent a = new Parent();
        a.tampilInfo();
    }
    
}
