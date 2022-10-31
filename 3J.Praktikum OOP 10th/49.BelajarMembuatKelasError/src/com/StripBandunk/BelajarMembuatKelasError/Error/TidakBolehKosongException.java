/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.StripBandunk.BelajarMembuatKelasError.Error;

/**
 *
 * @author iipsu
 */
public class TidakBolehKosongException extends Exception {

    /**
     * Creates a new instance of <code>TidakBolehKosongException</code> without
     * detail message.
     */
    public TidakBolehKosongException() {
    }

    /**
     * Constructs an instance of <code>TidakBolehKosongException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TidakBolehKosongException(String msg) {
        super(msg);
    }
}
