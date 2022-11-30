/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class A11_transaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A10_barang a = new A10_barang();
        
        a.inputKodeBarang("B0001");
        a.inputNamaBarang("Buku Gambar");
        a.inputHpp(2500);
        a.inputHargaJual(3000);
        a.inputStokAwal(5);
        a.inputJumlahJual(2);
        
        System.out.println("INPUT :");
        System.out.println("Kode Barang :" + a.tampilKodeBarang());
        System.out.println("Nama Barang :" + a.tampilNamaBarang());
        System.out.println("HPP :" + a.tampilHpp());
        System.out.println("Harga Jual :" + a.tampilHargaJual());
        System.out.println("Stok :" + a.tampilStokAwal());
        System.out.println("Jumlah Jual :" + a.tampilJumlahJual());
        
        System.out.println("OUTPUT :");
        System.out.println("Stok Sekarang :" + a.tampilStokAkhir());
        System.out.println("Total Bayar :" + a.tampilTotalBayar());
        System.out.println("Laba :" + a.tampillaba());
    }
    
}
