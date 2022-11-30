package com.atep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.List;
/**
 *
 * @author Lenovo Ideapad 5
 */
public class selectAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas perintah = new fasilitas();
        List<barang> list = perintah.selectAll();
        for(barang barang : list){
        System.out.println(barang.getKodeBarang());
        System.out.println(barang.getNamaBarang());
        System.out.println(barang.getJumlah());
        System.out.println(barang.getHarga());
        System.out.println("-------------------------");
        }
    }
   
}
