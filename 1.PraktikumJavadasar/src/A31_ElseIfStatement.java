/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A31_ElseIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int nilai = 70;
        int absen = 90;
        
        if (nilai >= 80 && absen >= 80) {
        System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
        System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
        System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
        System.out.println("Nilai Anda D");
        } else {
        System.out.println("Nilai Anda E");
        }
    }
    
}
