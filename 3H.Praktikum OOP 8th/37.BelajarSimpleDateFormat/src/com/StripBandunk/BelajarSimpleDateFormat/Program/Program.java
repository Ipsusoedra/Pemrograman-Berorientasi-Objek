/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarSimpleDateFormat.Program;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        SimpleDateFormat format = new SimpleDateFormat("EEEE, d MMMM YYYY \nHH : mm : ss a");
        
        Date tanggal = new Date();
        String hasil = format.format(tanggal);
        
        System.out.println(hasil);
    }
    
}
