/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iipsu
 */
public class A55_FactorialRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorialRecursive(10));
    }
    static int factorialRecursive(int value){
        if(value==1){
        return 1;
        }else{
        return value * factorialRecursive(value-1);
        }
        
    }
    
}
