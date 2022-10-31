/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Binatang {
   String nama;
   String jenis;
   String kaki;
   String tangan;
   
   Binatang(){
   System.out.println("Konsturktor pertama Dipanggil");
   }
   
   Binatang(String nama){
   System.out.println("Konsturktor kedua Dipanggil");
   this.nama = nama;
   }
   
   Binatang(String nama, String jenis){
   System.out.println("Konsturktor ketiga Dipanggil");
   this.nama = nama;
   this.jenis = jenis;
   }
}
