/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarString.Program;

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
        String nama = "Eko Kurniawan Khannedy";
        int panjang = nama.length();
        System.out.println("Panjang : " + panjang);
        
        boolean empty = nama.isEmpty();
        System.out.println(empty);
        
        String trim = nama.trim();
        System.out.println(trim);
        
        String upper = nama.toUpperCase();
        System.out.println(upper);
        
        String lower = nama.toLowerCase();
        System.out.println(lower);
        
        String[] split = nama.split(" ");
        for (String value : split){
        System.out.println(value);
        }
        
        char[] array = nama.toCharArray();
        for (char value : array){
        System.out.println(value);
        }
        
        boolean start = nama.startsWith("Eko");
        System.out.println(start);
        
        boolean end = nama.endsWith("Eko");
        System.out.println(end);
        
        System.out.println(nama.substring(2));
        
        System.out.println(nama.substring(2,10));
        
    }
    
}
