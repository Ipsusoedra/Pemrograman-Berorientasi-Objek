/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.StripBandunk.Visibility.Data;

/**
 *
 * @author hp
 */
public class Dosen {
    public String nip;
    public String nama;
    public String alamat;
    
    public void tampilInformasi(){
    System.out.println("NIP : " + nip);
    System.out.println("Nama : " + nama);
    System.out.println("Alamat : " + alamat);
    }
}
