/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarEnkapsulasi.Data;

/**
 *
 * @author iipsu
 */
public class Binatang {
    private String nama;
    private String jenis;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahTangan() {
        return jumlahTangan;
    }

    public void setJumlahTangan(int jumlahTangan) {
        this.jumlahTangan = jumlahTangan;
    }

    public boolean isKawin() {
        return kawin;
    }

    public void setKawin(boolean kawin) {
        this.kawin = kawin;
    }
    private int jumlahKaki;
    private int jumlahTangan;
    private boolean kawin;
    
    
}
