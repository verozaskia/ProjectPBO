/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class Rusali { //super class
    //properties
    public int nomorMeja;
    public int jumlahOrang;
    
    //constructor
    public Rusali(int nomorMeja, int jumlahOrang){
        this.nomorMeja = nomorMeja;
        this.jumlahOrang = jumlahOrang;
    }
    
    //behavior
    public void memesan(int meja, int orang){
        nomorMeja = meja;
        jumlahOrang = orang;
    }
    
    public String toString(){
        return("Nomor Meja: "+nomorMeja+
                "\nJumlah Orang: "+jumlahOrang);
    }
}
