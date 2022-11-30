/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A24_barang3 {
    private String kodeBarang, namaBarang;
    private int stokAwal, stokAkhir, jumlahJual;
    private long hpp, hargaJual, totalBayar, laba;
    
    public int tampilStokAkhir(){
        this.stokAkhir= this.stokAwal- this.jumlahJual;
        return stokAkhir;
    }
   
    public long tampilTotalBayar(){
        this.totalBayar = this.hargaJual*this.jumlahJual;
        return totalBayar;
    } 
   
    public long tampillaba(){
        this.laba = this.totalBayar - (this.hpp*this.jumlahJual);
        return laba;
    } 
    
    public A24_barang3(String kodeBarang, String namaBarang,long hpp, long hargaJual, int stokAwal,int jumlahJual ){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hpp = hpp;
        this.hargaJual = hargaJual;
        this.stokAwal = stokAwal;
        this.jumlahJual = jumlahJual;
    }
    public String tampilBarang(){
        return ("INPUT :\n"+"Kode Barang\t\t: " + kodeBarang + "\n" + "Nama Barang\t\t: " + namaBarang + "\n"+ "HPP\t: " + hpp + "\n" + "Harga Jual\t: " + hargaJual + "\n" + "Stok\t: " + stokAwal + "\n" + "Jumlah Jual\t: " + jumlahJual + "\n"
                + "OUTPUT :\n"+"Stok Sekarang\t\t: " + tampilStokAkhir() + "\n" + "Total Bayar\t\t: " + tampilTotalBayar() + "\n"+ "Laba\t: " + tampillaba() + "\n"
                );
        
    }
    
}
