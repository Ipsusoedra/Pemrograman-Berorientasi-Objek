/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarMembuatError.Data;

import com.StripBandunk.BelajarMembuatKelasError.Error.TidakBolehKosongException;

/**
 *
 * @author iipsu
 */
public class Orang {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws TidakBolehKosongException, NullPointerException {
        if(nama == null){
        throw new NullPointerException("Nama tidak boleh null");
        }else if(nama.isEmpty()){
        throw new TidakBolehKosongException("Nama tidak boleh kosong");
        }else{
        this.nama = nama;
        }
        
    }
    
}
