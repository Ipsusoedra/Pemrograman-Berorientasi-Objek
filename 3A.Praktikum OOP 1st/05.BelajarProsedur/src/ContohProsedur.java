/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia budi = new Manusia();
        budi.nama = "Budi Nugraha";
        budi.jenisKelamin = "Laki-laki";
        budi.alamat = "Cirebon";
        
        Manusia tini = new Manusia();
        tini.nama = "Tini Sumarni";
        tini.jenisKelamin = "Perempuan";
        tini.alamat = "Surabaya";
        
        budi.tampilInformasi();
        tini.tampilInformasi();
    }
    
}
