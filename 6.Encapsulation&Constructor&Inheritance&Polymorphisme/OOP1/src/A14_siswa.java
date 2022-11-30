/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A14_siswa extends A13_pelajar{
    private String nim, asalSekolah;
    private long nilai;
    
    public A14_siswa(String nama, long tinggi, long berat, String nim, String asalSekolah, long nilai){
    super(nama, tinggi, berat);
    this.nim = nim;
    this.asalSekolah = asalSekolah;
    this.nilai = nilai;
    }
    
    public String tampilSiswa(){
    return(super.tampilPelajar()+ "nim\t: " + nim + "\nAsal Sekolah : " + asalSekolah + "\nNilai\t: "+ nilai);
    }
    
}
