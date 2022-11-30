/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A27_kegiatan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A24_barang3[] informasi= new A24_barang3[2];
        informasi[0]=new A25_bukuGambar2("B0001", "Buku Gambar", 2500, 3000, 5, 2);
        informasi[1]=new A26_pensil("P0002", "Pensil 2B", 1500, 1750, 10, 1);
        for (int i=0; i<2; i++) {
            System.out.println("------------------------------");
            System.out.println(informasi[i].tampilBarang());
        }
    }
    
}
