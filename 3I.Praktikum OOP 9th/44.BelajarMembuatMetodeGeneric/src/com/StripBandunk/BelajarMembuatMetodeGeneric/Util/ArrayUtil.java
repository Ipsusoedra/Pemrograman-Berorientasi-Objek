/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarMembuatMetodeGeneric.Util;

/**
 *
 * @author iipsu
 */
public class ArrayUtil {
    public static <T> T ambilTengah(T[] array){
    int tengah = array.length/2;
    return array[tengah];
    }
    
//    public static int ambilTengah(int[] array){
//    int tengah = array.length;
//    return array[tengah];
//    }
//    
//    public static Double ambilTengah(Double[] array){
//    int tengah = array.length;
//    return array[tengah];
//    }
}
