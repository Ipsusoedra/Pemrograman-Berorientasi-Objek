/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A13_pelajar {
    private String nama;
    private long tinggi;
    private long berat;
    
    public A13_pelajar(String nama, long tinggi, long berat){
    this.nama = nama;
    this.tinggi = tinggi;
    this.berat = berat;
    }
    public String tampilPelajar(){
    return ("Nama\t : " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: "+ berat + "\n");
    }
}
