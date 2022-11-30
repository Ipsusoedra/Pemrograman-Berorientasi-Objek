/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A23_kegiatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A20_manusia[] informasi= new A20_manusia[2];
        informasi[0]=new A21_programmer("Programmer", "Futsal", "Mengetik Sintak");
        informasi[1]=new A22_polisi("Polisi", "Fusal", "Operasi keliling");
        for (int i=0; i<2; i++) {
            System.out.println("------------------------------");
            System.out.println(informasi[i].tampilManusia());
        }
    }
    
}
