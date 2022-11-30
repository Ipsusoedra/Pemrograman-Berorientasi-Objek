/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A08_sepedaMotor {
    private String merk, tipe;
    private int tangki;
    private long harga;
    
    public void inputMerk(String merk){
    this.merk=merk;
    } 
    public void inputTipe(String tipe){
    this.tipe=tipe;
    } 
    public void inputTangki(int tangki){
    this.tangki = tangki;
    } 
    public void inputHarga(long harga){
    this.harga=harga;
    }
    
    public String tampilMerk(){
    return merk;
    } 
    public String tampiltipe(){
    return tipe;
    } 
    public int tampilTangki(){
    return tangki;
    } 
    public long tampilHarga(){
    return harga;
    } 
    
}
