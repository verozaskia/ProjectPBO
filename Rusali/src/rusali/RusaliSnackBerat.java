/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rusali;

/**
 *
 * @author Vito
 */
public class RusaliSnackBerat extends RusaliSnack{
    
    public RusaliSnackBerat(int nomorMeja, int jumlahOrang, int jumlahSnack){
        super(nomorMeja, jumlahOrang, jumlahSnack);
    }
    
    public String cetakDetail(){
        return("\nIni adalah snack BERAT\n");
    }
}
