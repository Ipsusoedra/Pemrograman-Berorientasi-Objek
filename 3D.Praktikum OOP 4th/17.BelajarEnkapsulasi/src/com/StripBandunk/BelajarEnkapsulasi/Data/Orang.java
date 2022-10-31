/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarEnkapsulasi.Data;

/**
 *
 * @author iipsu
 */
public class Orang {
    private String nama;
    
    public void ubahNama(String nama){
    if(nama == null){
    System.out.println("Nama tidak boleh null");
    }else if(nama.isEmpty()){
    System.out.println("Nama tidak boleh kosong");
    }else{
    this.nama = nama;
    }
    }
    
    public String tanyaNama(){
    if(this.nama == null){
    return "Nama belum ada";
    }else{
    return this.nama;
    }
    }
    
}
