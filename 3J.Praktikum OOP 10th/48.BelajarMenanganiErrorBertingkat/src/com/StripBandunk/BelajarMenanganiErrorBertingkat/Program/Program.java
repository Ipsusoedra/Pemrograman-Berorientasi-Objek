/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMenanganiErrorBertingkat.Program;

import com.StripBandunk.BelajarMenanganiErrorBertingkat.Data.Contoh;

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
      int a =100;
      int b= 2;
      int c = a/b;
      
      Contoh contoh = null;
      contoh.test();
      }catch(ArithmeticException | NullPointerException error){
      if(error instanceof ArithmeticException){
      System.out.println("Error!!! ArithmeticException ditangani");
      }else if(error instanceof NullPointerException){
      System.out.println("Error!!! NullPointerException ditangani");
      }
      }
     
    }
    
}
