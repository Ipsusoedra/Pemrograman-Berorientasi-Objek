
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A05_latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        input = JOptionPane.showInputDialog("Masukkan Angka Pertama : ");
        long angka = Integer.valueOf(input).intValue();
        String input2;
        input2 = JOptionPane.showInputDialog("Masukkan Angka Kedua : ");
        long angka2 = Integer.valueOf(input2).intValue();
        
        long tambah;
        tambah = angka + angka2;
        
        JOptionPane.showMessageDialog(null, angka + " + " + angka2 +" = "+ tambah);
        
    }
    
}
