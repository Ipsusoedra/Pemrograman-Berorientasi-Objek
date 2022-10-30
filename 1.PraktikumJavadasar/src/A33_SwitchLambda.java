/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A33_SwitchLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai = "A";
        
        switch (nilai) {
        case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
        case "B", "C" -> System.out.println("Anda Lulus");
        case "D" -> System.out.println("Anda Tidak Lulus");
        default -> {
          System.out.println("Mungkin Anda Salah Jurusan");
        }
        }
    }
    
}
