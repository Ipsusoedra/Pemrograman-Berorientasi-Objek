/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Lenovo Ideapad 5
 */
public class A04_inputMerek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        input = JOptionPane.showInputDialog("Masukkan Harga : ");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null, harga);
    }
    
}
