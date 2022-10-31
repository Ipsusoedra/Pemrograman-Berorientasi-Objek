/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class bank {
    int saldo;
    int simpanUang;
    int ambilUang;
    int getSaldo;
    
   bank(int saldo){
   System.out.println("Selamat Datang di Bank ABC");
   this.saldo = saldo;
   System.out.println("Saldo saat ini = " + this.saldo);
   
   }
   
   void simpanUang(int simpanUang){
   this.simpanUang = simpanUang;
   System.out.println("Simpan uang = " + this.simpanUang);
   }
   void ambilUang(int ambilUang){
   this.ambilUang = ambilUang;
   System.out.println("Ambil uang = " + this.ambilUang);
   }
   void getSaldo(){
    this.getSaldo = saldo + simpanUang - ambilUang;
    System.out.println("Saldo saat ini = " + this.getSaldo);
   }
   
}
