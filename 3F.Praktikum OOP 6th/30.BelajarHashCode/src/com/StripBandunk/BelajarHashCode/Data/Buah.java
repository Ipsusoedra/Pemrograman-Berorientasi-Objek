/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarHashCode.Data;

import java.util.Objects;

/**
 *
 * @author iipsu
 */
public class Buah {
    public String nama;
    public int Biji;
    public int banyak;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nama);
        hash = 13 * hash + this.Biji;
        hash = 13 * hash + this.banyak;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Buah other = (Buah) obj;
        if (this.Biji != other.Biji) {
            return false;
        }
        if (this.banyak != other.banyak) {
            return false;
        }
        return Objects.equals(this.nama, other.nama);
    }
}
