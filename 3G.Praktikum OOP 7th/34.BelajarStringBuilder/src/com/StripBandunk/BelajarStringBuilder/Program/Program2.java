/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarStringBuilder.Program;

/**
 *
 * @author iipsu
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder nama = new StringBuilder();
        
        nama.append("Eko");
        nama.append(" ");
        nama.append("Kurniawan");
        nama.append(" ");
        nama.append("Khannedy");
        
        String hasil = nama.toString();
        
        System.out.println(hasil);
    }
    
}
