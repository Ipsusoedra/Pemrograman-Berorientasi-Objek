
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A54_FactorialLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(factorial(10));
    }
    static int factorial(int value) {
    int result = 1;

    for (int i = 1; i <= value; i++) {
      result *= i;
    }

    return result;
  }
    
    
}
