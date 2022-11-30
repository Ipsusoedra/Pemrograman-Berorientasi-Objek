/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.atep;

/**
 *
 * @author Lenovo Ideapad 5
 */
public class ProgramInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      barang barang = new barang();
        String kd="B001' OR 'atep'='atep";
        barang.delete(kd);
        String sql = "DELETE FROM barang WHERE kode_barang='"+kd+"'";
        System.out.println(sql); 
    }
    
}
