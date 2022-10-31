/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarEnum.Data;

/**
 *
 * @author iipsu
 */
public class Orang {
    public String nama;
    public JenisKelamin jenisKelamin;
    public String alamat;
    
    public void tampilInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("Jenis Kelamin : " + jenisKelamin);
    System.out.println("Alamat : " + alamat);
    }
}
