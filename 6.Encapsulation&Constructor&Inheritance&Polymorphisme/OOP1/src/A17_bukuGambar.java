/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A17_bukuGambar extends A16_barang2 {
   private long hpp, hargaJual, totalBayar, laba;
   private int stokAwal, stokAkhir, jumlahJual;
   
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
   
  
   public A17_bukuGambar(String kodeBarang, String namaBarang, long hpp, long hargaJual, int stokAwal, int jumlahJual){
    super(kodeBarang, namaBarang);
    this.hpp = hpp;
    this.hargaJual = hargaJual;
    this.stokAwal = stokAwal;
    this.jumlahJual = jumlahJual;
   }
    
    public String tampilInputBukuGambar(){
    return("INPUT :\n"+ super.tampilBarang()+ "HPP\t:" + hpp + "\nHarga Jual\t:" + hargaJual + "\nStok \t:"+ stokAwal + "\nJumlah Jual\t:"+ jumlahJual );
    }
    
    public String tampilOutputBukuGambar(){
    return("OUTPUT :\n" + "Stok Sekarang\t:" + tampilStokAkhir() + "\nTotal Bayar\t:" + tampilTotalBayar() + "\nLaba\t:"+ tampillaba());
    }
}
