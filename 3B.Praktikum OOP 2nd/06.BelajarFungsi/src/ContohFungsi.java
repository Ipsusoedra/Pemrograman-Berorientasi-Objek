/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohFungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
       mtk.nilai1= 100;
       mtk.nilai2 = 10;
       
       int hasil = mtk.tambah();
       System.out.println("Hasil Tambah = " + hasil);
       
       hasil = mtk.kurang();
       System.out.println("Hasil Kurang = " + hasil);
       
       hasil = mtk.kali();
       System.out.println("Hasil Kali = " + hasil);
       
       hasil = mtk.bagi();
       System.out.println("Hasil Bagi = " + hasil);
       
    }
    
}
