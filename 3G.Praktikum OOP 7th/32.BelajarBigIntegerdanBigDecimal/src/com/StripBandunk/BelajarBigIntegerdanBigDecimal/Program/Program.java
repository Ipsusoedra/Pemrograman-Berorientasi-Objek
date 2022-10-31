/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarBigIntegerdanBigDecimal.Program;

import java.math.BigDecimal;
import java.math.BigInteger;

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
        BigInteger a = new BigInteger("100000000000000000000000000"); 
        BigInteger b = new BigInteger("100"); 
        BigInteger c = a.add(b);
        BigInteger d = a.subtract(b);
        BigInteger e = a.multiply(b);
        BigInteger f = a.divide(b);
        BigInteger g = a.mod(b);
        
        
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
        BigDecimal h = new BigDecimal("100000000000000000000000000.00"); 
        BigDecimal i = new BigDecimal("100.50"); 
        BigDecimal j = h.add(i);
        
        System.out.println(j);
    }
    
}
