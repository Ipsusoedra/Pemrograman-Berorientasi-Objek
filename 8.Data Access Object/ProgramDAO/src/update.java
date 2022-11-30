/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKodeBarang("B002");
        atk.setNamaBarang("Buku Cerita");
        atk.setJumlah(1);
        atk.setHarga(5000);
        perintah.update(atk);
    }
    
}
