/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class bankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank bca = new bank (100000);
        bca.simpanUang(500000);
        bca.getSaldo();
        bca.ambilUang(150000);
        bca.getSaldo();
        
       
    }
    
}
