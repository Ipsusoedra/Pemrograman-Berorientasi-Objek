/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.StripBandunk.BelajarVisibilityPublic.Data;

/**
 *
 * @author hp
 */
public class mataKuliah {
    public String kode;
    public String nama;
    public int sks;
    
    public void tampilInformasi(){
    System.out.println("Kode : " + kode);
    System.out.println("Nama : " + nama);
    System.out.println("SKS : " + sks);
    }
}
