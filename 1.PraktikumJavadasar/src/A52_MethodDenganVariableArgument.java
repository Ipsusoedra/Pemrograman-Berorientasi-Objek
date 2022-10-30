/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A52_MethodDenganVariableArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = {80, 90, 79, 48};
        sayCongrats("Eko", values);
    }
    static void sayCongrats(String name, int... values) {
    int total = 0;
    for (int value : values) {
      total += value;
    }
    
    int finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Lulus");
    }
  }
    
}
