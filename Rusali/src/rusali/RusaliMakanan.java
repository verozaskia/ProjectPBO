/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliMakanan extends Rusali{ //child class of Rusali
    //properties
    private int hargaMakanan;
    public int jumlahMakanan;
    private String diskonKode = "MAKANMURAH";
    private int diskonRate;
    
    //constructor
    public RusaliMakanan (int nomorMeja, int jumlahOrang, int jumlahMakanan){
        super(nomorMeja, jumlahOrang);
        this.jumlahMakanan = jumlahMakanan;
    }
    
    //methods
    public void cetakBiayaMakan(){ //overloading
        System.out.println("");
        System.out.println("=== Detil Makanan ===\nHarga makanan: Rp"+hargaMakanan+
                            "\nJumlah makanan: "+jumlahMakanan+
                            "\nBiaya makanan: Rp"+(hargaMakanan*jumlahMakanan));
    }
    
    public void cetakBiayaMakan(String diskon){ //overloading
        if(diskon.equals(diskonKode)){
            System.out.println("");
            System.out.println("===Detil Makanan===\nHarga makanan: Rp"+hargaMakanan+
                            "\nJumlah makanan: "+jumlahMakanan+
                            "\nBiaya makanan: Rp"+(hargaMakanan*jumlahMakanan)+
                            "\nBiaya makanan setalah diskon: Rp"+((hargaMakanan*jumlahMakanan)-diskonRate));
        }
        else{
            cetakBiayaMakan();
            System.out.println("Kode diskon tidak berlaku");
        }
    }
    
    public String cetakDetilPesanan(){ //overriding
        return ("Ini adalah pesanan makanan");
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

    /**
     * @return the diskonRate
     */
    public int getDiskonRate() {
        return diskonRate;
    }

    /**
     * @param diskonRate the diskonRate to set
     */
    public void setDiskonRate(int diskonRate) {
        this.diskonRate = diskonRate;
    }
}
