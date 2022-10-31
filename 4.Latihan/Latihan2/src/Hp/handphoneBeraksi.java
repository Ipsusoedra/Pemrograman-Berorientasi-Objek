/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hp;


/**
 *
 * @author hp
 */
public class handphoneBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        handphone samsung = new handphone();
        samsung.hidupkan();
        samsung.lakukanPanggilan();
        samsung.kirimSMS();
        samsung.matikan();
    }
    
}
