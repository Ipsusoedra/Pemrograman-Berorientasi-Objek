/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Buah {
   String nama;
   int biji;
   String jenis;
   
   void ubahData(String nama){
   System.out.println("Ubah Data Pertama");
   this.nama = nama;
   }
   
   void ubahData(String nama, int biji){
   System.out.println("Ubah Data Kedua");
   this.nama = nama;
   this.biji= biji;
   }
   
   void ubahData(String nama, int biji, String jenis){
   System.out.println("Ubah Data Ketiga");
   this.nama = nama;
   this.biji= biji;
   this.jenis = jenis;
   }
   
   void tampilData(){
   System.out.println("Nama " + nama);
   System.out.println("Biji " + biji);
   System.out.println("Jenis " + jenis);
   }
}
