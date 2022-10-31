/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarPolimorfisme.Data;

/**
 *
 * @author iipsu
 */
public class Dosen extends Manusia {
    private String nip;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public void tampilInfo(){
    System.out.println("Dosen");
    }
}
