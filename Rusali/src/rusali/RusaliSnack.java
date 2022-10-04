/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliSnack extends Rusali{
    private int kodeSnack; //jika 1 snavk ringan, jika 2 snack berat
    
    public RusaliSnack (int nomorMeja, int jumlahPesanan,int kodeSnack){
        super(nomorMeja, jumlahPesanan);
        this.kodeSnack = kodeSnack;
    }
}
