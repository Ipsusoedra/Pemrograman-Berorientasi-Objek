/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orang budi = new Orang();
        budi.nama= "Budi";
        budi.alamat = "Bandung ";
        budi.umur = 25 ;
        budi.menikah = false;
        
        Orang rina = new Orang();
        rina.nama= "Rina";
        rina.alamat = "Jakarta ";
        rina.umur = 20 ;
        rina.menikah = false;
        
        System.out.println(rina.nama);
        System.out.println(budi.nama);
    }
    
}
