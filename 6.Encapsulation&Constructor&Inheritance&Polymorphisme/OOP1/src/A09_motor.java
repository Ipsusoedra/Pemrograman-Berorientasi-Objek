/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A09_motor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       A08_sepedaMotor motor = new A08_sepedaMotor();
       motor.inputMerk("Yamaha");
       motor.inputTipe("MX - 125cc");
       motor.inputTangki(4);
       motor.inputHarga(15000000);
       
       System.out.println("Rincian Motor");
       System.out.println("Merk : " + motor.tampilMerk());
       System.out.println("Tipe :" + motor.tampiltipe());
       System.out.println("Tangki : " + motor.tampilTangki());
       System.out.println("Harga : " + motor.tampilHarga());
    }
    
}
