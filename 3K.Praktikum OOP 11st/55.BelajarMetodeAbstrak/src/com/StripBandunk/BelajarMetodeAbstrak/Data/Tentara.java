/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarMetodeAbstrak.Data;

/**
 *
 * @author iipsu
 */
public class Tentara {
   private Senjata senjata1;
   private Senjata senjata2;

    public Senjata getSenjata1() {
        return senjata1;
    }

    public void setSenjata1(Senjata senjata1) {
        this.senjata1 = senjata1;
    }

    public Senjata getSenjata2() {
        return senjata2;
    }

    public void setSenjata2(Senjata senjata2) {
        this.senjata2 = senjata2;
    }
   
   public void serang(){
   senjata1.nama();
   senjata1.tembak();
   senjata2.nama();
   senjata2.tembak();
   }
}
