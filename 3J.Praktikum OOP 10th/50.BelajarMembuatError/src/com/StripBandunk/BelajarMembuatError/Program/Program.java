/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMembuatError.Program;

import com.StripBandunk.BelajarMembuatError.Data.Orang;
import com.StripBandunk.BelajarMembuatKelasError.Error.TidakBolehKosongException;

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
        try{
        Orang a = new Orang();
        a.setNama(null);
        }catch(TidakBolehKosongException error){
        System.out.println(error.getMessage());
        }catch(NullPointerException error){
        System.out.println(error.getMessage());
        }
    }
    
}
