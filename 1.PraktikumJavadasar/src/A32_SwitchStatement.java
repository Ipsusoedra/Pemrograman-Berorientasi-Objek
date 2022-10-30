/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A32_SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai = "A";

        switch (nilai) {
          case "A":
            System.out.println("Wow Anda Lulus Dengan Baik");
            break;
          case "B":
          case "C":
            System.out.println("Anda Lulus");
            break;
          case "D":
            System.out.println("Anda tidak lulus");
            break;
          default:
            System.out.println("Mungkin Anda salah jurusan");
        }
    }
    
}
