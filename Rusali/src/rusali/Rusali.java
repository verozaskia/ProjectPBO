/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class Rusali {
    public int nomorMeja;
    public int jumlahPesanan;
    
    public Rusali(int nomorMeja, int jumlahPesanan){
        this.jumlahPesanan = jumlahPesanan;
        this.nomorMeja = nomorMeja;
    }
    
    public void memesan(int pesanan, int meja, boolean antri){
        jumlahPesanan += pesanan;
        nomorMeja = meja;
    }
    
    public String toString(){
        return("Nomor Meja: "+nomorMeja+
                "\nJumlah Pesanan: "+jumlahPesanan);
    }
}
