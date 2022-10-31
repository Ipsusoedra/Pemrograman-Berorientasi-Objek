/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarVisibilityPrivate.Data;

/**
 *
 * @author iipsu
 */
public class Mobil {
    private String merek;
    private String warna;
    
    public void ubahData(String merek, String warna){
    this.merek = merek;
    this.warna = warna;
    }
    public void tampilInformasi(){
    System.out.println("Merek : " + merek);
    System.out.println("Warna : " + warna);
    }
}
