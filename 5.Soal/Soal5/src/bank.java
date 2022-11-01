/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo Ideapad 5
 */
public class bank {
    int saldoSaya;
    int total;
    bank(int saldo){
    saldoSaya = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldoSaya);
        
    }
    void simpanUang(int simpan){
        total = simpan + saldoSaya;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
    }
    void ambilUang(int ambil){
        int total2 = total - ambil;
        if(ambil < total2){
        System.out.println("Ambil uang : " + ambil);
        System.out.println("Saldo saat ini : Rp." + total2);
        }else if(ambil > total2){
        System.out.println("Maaf Saldo anda tidak cukup");
        }
    }
}
