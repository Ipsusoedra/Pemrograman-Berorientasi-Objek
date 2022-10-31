/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika a = new Matematika();
        
        double hasil = a.pertambahan(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.pengurangan(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.perkalian(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.pembagian(12.5,28.7,14.2);
        System.out.println(hasil);
        
        hasil = a.modulus(12.5,28.7,14.2);
        System.out.println(hasil);
    }
    
}
