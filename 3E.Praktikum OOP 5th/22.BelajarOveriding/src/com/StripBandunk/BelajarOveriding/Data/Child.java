/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarOveriding.Data;

/**
 *
 * @author iipsu
 */
public class Child extends Parent{
    public void tampilInfo(){
    System.out.println("Child");
    }
    
    public void tampilInfoParent(){
    super.tampilInfo();
    }
}
