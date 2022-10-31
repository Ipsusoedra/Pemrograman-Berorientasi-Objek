/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarPewarisanInterface.Data;

/**
 *
 * @author iipsu
 */
public class Karyawan implements Manusia {

    @Override
    public void makan() {
     System.out.println("Makan");
    }

    @Override
    public void minum() {
    System.out.println("Minum");
    }

    @Override
    public void jalan() {
    System.out.println("Jalan");
    }
    
}
