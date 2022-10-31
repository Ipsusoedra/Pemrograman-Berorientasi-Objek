/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.StripBandunk.BelajarMenanganiError.Program;

import java.util.Scanner;

/**
 *
 * @author iipsu
 */
public class ProgramBagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bilangan pertama :");
        int a = input.nextInt();
        
        System.out.println("Bilangan kedua :");
        int b = input.nextInt();
        
        try{
        int c = a/b;
        System.out.println("Hasil : " + c);   
        }catch(ArithmeticException error){
        System.out.println("Ups. Program Error"); 
        System.out.println("Pesan error : " + error.getMessage()); ;
        }
            
        
    }
    
}
