/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarToString.Data;

/**
 *
 * @author iipsu
 */
public class Manusia {
    private String nama;
    private String jenisKelamin;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
//    public String toString(){
//    return "Manusia \nNama : " + nama + "\nJenis Kelamin : " + jenisKelamin + "\nAlamat : " + alamat;
//    }

    @Override
    public String toString() {
        return "Manusia\n{" + "nama : " + nama + ", Jenis Kelamin : " + jenisKelamin + ", Alamat : " + alamat + '}';
    }
    
    
}
