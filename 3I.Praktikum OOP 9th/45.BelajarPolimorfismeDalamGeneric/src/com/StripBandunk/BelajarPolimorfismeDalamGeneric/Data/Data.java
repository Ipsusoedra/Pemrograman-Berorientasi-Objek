/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarPolimorfismeDalamGeneric.Data;

/**
 *
 * @author iipsu
 */
public class Data<T extends Parent> {
    private T data;
   

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
