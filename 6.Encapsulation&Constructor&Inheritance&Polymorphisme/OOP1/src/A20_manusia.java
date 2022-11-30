/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A20_manusia {
    public String nama, hobby, pekerjaan;
    
    public A20_manusia (String nama, String hobby, String pekerjaan) {
        this.nama= nama;
        this.hobby = hobby;
        this.pekerjaan = pekerjaan;
    }
    
    public String tampilManusia (){
    return ("Nama\t\t: " + nama + "\n" + "Hobby\t\t: " + hobby + "\n"+ "Pekerjaan\t: " + pekerjaan + "\n");
    }
    
}
