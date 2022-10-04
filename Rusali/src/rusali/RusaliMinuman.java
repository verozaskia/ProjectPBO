/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliMinuman extends Rusali{
    private int hargaMinuman;
    public int jumlahMinuman;
    
    public RusaliMinuman (int nomorMeja, int jumlahPesanan,int hargaMinuman, int jumlahMinuman){
        super(nomorMeja, jumlahPesanan);
        this.hargaMinuman = hargaMinuman;
        this.jumlahMinuman = jumlahMinuman;
    }
    
    public void cetakBiayaMinum(){
        System.out.println("Biaya minum adalah Rp"+(hargaMinuman*jumlahMinuman));
    }
}
