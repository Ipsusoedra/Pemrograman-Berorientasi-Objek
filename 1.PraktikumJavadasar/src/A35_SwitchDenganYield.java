/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A35_SwitchDenganYield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai = "A";
        String ucapan = switch (nilai) {
        case "A" : 
            yield "Wow Anda Lulus Dengan Baik";
        case "B", "C" : 
            yield "Anda Lulus";
        case "D" : 
            yield "Anda Tidak Lulus";
        default : 
            yield "Mungkin Anda Salah Jurusan";
        };
        
        System.out.println(ucapan);
    }
    
}
