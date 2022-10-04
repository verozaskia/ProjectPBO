/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliSnack extends Rusali{ //child class of Rusali
    //properties
    private int hargaSnack;
    public int jumlahSnack;
    private String diskonKode = "SNACKENAK";
    private int diskonRate;
    
    //constructor
    public RusaliSnack (int nomorMeja, int jumlahOrang, int jumlahSnack){
        super(nomorMeja, jumlahOrang);
        this.jumlahSnack = jumlahSnack;
    }
    
    //methods
    public void cetakBiayaSnack(){ //overloading
        System.out.println("");
        System.out.println("=== Detil Snack ===\nHarga makanan: Rp"+hargaSnack+
                            "\nJumlah snack: "+jumlahSnack+
                            "\nBiaya snack: Rp"+(hargaSnack*jumlahSnack));
    }
    
    public void cetakBiayaSnack(String diskon){ //overloading
        if(diskon.equals(diskonKode)){
            System.out.println("");
            cetakBiayaSnack();
            System.out.println("Biaya snack setalah diskon: Rp"+((hargaSnack*jumlahSnack)-diskonRate));
        }
        else{
            cetakBiayaSnack();
            System.out.println("Kode diskon tidak berlaku");
        }
    }
    
    public String cetakDetilPesanan(){ //overriding
        return ("Ini adalah pesanan snack");
    }

    //encapsulation
    public int getHargaSnack() {
        return hargaSnack;
    }

    public void setHargaSnack(int hargaSnack) {
        this.hargaSnack = hargaSnack;
    }

    public int getDiskonRate() {
        return diskonRate;
    }

    public void setDiskonRate(int diskonRate) {
        this.diskonRate = diskonRate;
    }
}
