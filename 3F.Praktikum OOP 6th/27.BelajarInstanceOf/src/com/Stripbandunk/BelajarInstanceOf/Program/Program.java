/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Stripbandunk.BelajarInstanceOf.Program;

import com.Stripbandunk.BelajarInstanceOf.Data.ChildA;
import com.Stripbandunk.BelajarInstanceOf.Data.ChildB;
import com.Stripbandunk.BelajarInstanceOf.Data.ChildC;
import com.Stripbandunk.BelajarInstanceOf.Data.Contoh;
import com.Stripbandunk.BelajarInstanceOf.Data.Parent;

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
//      Parent p = new ChildA();
        Object p = new Contoh();
        
        if(p instanceof ChildA){
        System.out.println("p bagian dari objek ChildA");
        }else if(p instanceof ChildB){
        System.out.println("p bagian dari objek ChildB");
        }else if(p instanceof ChildC){
        System.out.println("p bagian dari objek ChildC");
        }else if(p instanceof Contoh){
        System.out.println("p bagian dari objek Contoh");
        }
        
        boolean hasil = p instanceof ChildA;
        System.out.println(hasil);
        
    }
    
}
