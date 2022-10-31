/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarPolimorfisme.Data;

/**
 *
 * @author iipsu
 */
public class Mahasiswa extends Manusia {
    private String nim;
    
    public void tampilInfo(){
    System.out.println("Mahasiswa");
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
