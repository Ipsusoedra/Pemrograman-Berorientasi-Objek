/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarKelasTanpaNama.Program;

import com.StripBandunk.BelajarKelasTanpaNama.Data.Contoh;

/**
 *
 * @author iipsu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contoh contoh = new Contoh(){
            
            public void prosedur() {
                System.out.println("Kelas Tanpa Nama");
            }

            
            public String fungsi() {
                return "Kelas tanpa nama";
            }
        
        };
        
        Contoh contoh2 = new Contoh(){
            
            public void prosedur() {
                System.out.println("Kelas Tanpa Nama 2");
            }

            
            public String fungsi() {
                return "Kelas tanpa nama 2";
            }
        
        };
        contoh.prosedur();
        contoh2.prosedur();
        
    }
    
}
