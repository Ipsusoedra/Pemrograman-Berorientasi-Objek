/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A34_SwitchTanpaYield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai = "A";
        String ucapan;
        
        switch (nilai) {
        case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
        case "B", "C" -> ucapan = "Anda Lulus";
        case "D" -> ucapan = "Anda Tidak Lulus";
        default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        
        System.out.println(ucapan);
    }
    
}
