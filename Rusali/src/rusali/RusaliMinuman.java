/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliMinuman extends Rusali{ //child class of Rusali
    //properties
    private int hargaMinuman;
    public int jumlahMinuman;
    private String diskonKode = "MINUMSEGAR";
    private int diskonRate;
    
    //constructor
    public RusaliMinuman (int nomorMeja, int jumlahOrang, int jumlahMinuman){
        super(nomorMeja, jumlahOrang);
        this.jumlahMinuman = jumlahMinuman;
    }
    
    //methods
    public void cetakBiayaMinum(){ //overloading
        System.out.println("");
        System.out.println("=== Detil Minuman ===\nHarga minuman: Rp"+hargaMinuman+
                            "\nJumlah minuman: "+jumlahMinuman+
                            "\nBiaya minuman: Rp"+(hargaMinuman*jumlahMinuman));
    }
    
    public void cetakBiayaMinum(String diskon){ //overloading
        if(diskon.equals(diskonKode)){
            System.out.println("");
            cetakBiayaMinum();
            System.out.println("Biaya minuman setalah diskon: Rp"+((hargaMinuman*jumlahMinuman)-diskonRate));                
        }
        else{
            cetakBiayaMinum();
            System.out.println("Kode diskon tidak berlaku");
        }
    }
    
    public String cetakDetilPesanan(){ //overriding
        return ("Ini adalah pesanan minuman");
    }

    //encapsulation
    public int getHargaMinuman() {
        return hargaMinuman;
    }

    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    public int getDiskonRate() {
        return diskonRate;
    }

    public void setDiskonRate(int diskonRate) {
        this.diskonRate = diskonRate;
    }
}
