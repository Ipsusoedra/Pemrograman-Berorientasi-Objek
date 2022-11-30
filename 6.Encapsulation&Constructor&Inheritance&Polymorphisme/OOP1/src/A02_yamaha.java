/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A02_yamaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A01_sepedaMotor yamaha = new A01_sepedaMotor();
        
        yamaha.inputMerk("Yamaha");
        
        System.out.println("Merek motor ini adalah : " + yamaha.tampilMerk());
    }
    
}
