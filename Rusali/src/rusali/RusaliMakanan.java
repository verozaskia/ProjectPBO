/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliMakanan extends Rusali{
    private int hargaMakanan;
    public int jumlahMakanan;
    
    public RusaliMakanan (int nomorMeja, int jumlahPesanan, int jumlahMakanan){
        super(nomorMeja, jumlahPesanan);
        this.hargaMakanan = hargaMakanan;
        this.jumlahMakanan = jumlahMakanan;
    }
    
    public void cetakBiayaMakan(){
        System.out.println("Biaya makan adalah Rp"+(getHargaMakanan()*jumlahMakanan));
    }

    /**
     * @return the hargaMakanan
     */
    public int getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaMakanan the hargaMakanan to set
     */
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
}
