/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A16_barang2 {
    private String kodeBarang, namaBarang;
    
    public A16_barang2(String kodeBarang, String namaBarang){
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    }
    public String tampilBarang(){
    return ("Kode Barang\t: " + kodeBarang + "\nNama Barang\t:" + namaBarang + "\n");
    }
    
}
