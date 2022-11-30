/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A10_barang {
    private String kodeBarang, namaBarang;
    private int stokAwal, stokAkhir, jumlahJual;
    private long hpp, hargaJual, totalBayar, laba;
    
    public void inputKodeBarang(String kodeBarang){
    this.kodeBarang=kodeBarang;
    } 
    public void inputNamaBarang(String namaBarang){
    this.namaBarang=namaBarang;
    } 
    public void inputStokAwal(int stokAwal){
    this.stokAwal=stokAwal;
    } 
    public void inputStokAkhir(int stokAkhir){
    this.stokAkhir=stokAkhir;
    }
    
    public void inputJumlahJual(int jumlahJual){
    this.jumlahJual=jumlahJual;
    } 
    
    public void inputHpp(long hpp){
    this.hpp=hpp;
    } 
    public void inputHargaJual(long hargaJual){
    this.hargaJual=hargaJual;
    } 
    public void inputTotalBayar(long totalBayar){
    this.totalBayar=totalBayar;
    } 
    public void inputLaba(long laba){
    this.laba=laba;
    }   
    
    
    public String tampilKodeBarang(){
    return kodeBarang;
    } 
    public String tampilNamaBarang(){
    return namaBarang;
    } 
    public int tampilStokAwal(){
    return stokAwal;
    } 
    public int tampilStokAkhir(){
    this.stokAkhir= this.stokAwal- this.jumlahJual;
    return stokAkhir;
    }
    public int tampilJumlahJual(){
    return jumlahJual;
    }
    public long tampilHpp(){
    return hpp;
    } 
    public long tampilHargaJual(){
    return hargaJual;
    } 
    public long tampilTotalBayar(){
    this.totalBayar = this.hargaJual*this.jumlahJual;
    return totalBayar;
    } 
    public long tampillaba(){
    this.laba = this.totalBayar - (this.hpp*this.jumlahJual);
    return laba;
    } 
}
