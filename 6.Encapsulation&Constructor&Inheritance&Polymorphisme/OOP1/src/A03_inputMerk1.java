/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author Lenovo Ideapad 5
 */
public class A03_inputMerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String merk;
        System.out.println("Masukkan Merek : ");
        merk = input.readLine();
        System.out.println("Merek Motor ini adalah : " + merk);
        
    }
    
}
