/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Lenovo Ideapad 5
 */
public class A06_segitiga {
    String alas, tinggi, hasil;
    
    public void input(){
    this.alas = JOptionPane.showInputDialog( "Masukkan Alas :  ");
    
    this.tinggi = JOptionPane.showInputDialog("Masukkan Tinggi : ");
    }
    
    public double hitung(){
    long a = Long.parseLong(alas);
    long b = Long.parseLong(tinggi);
    return(0.5*a*b);
    }
    
    
    public void hasil(){
    JOptionPane.showMessageDialog(null,"0.5 * " + this.alas+" * "+ this.tinggi+" = "+ this.hitung());
    }
    

}
