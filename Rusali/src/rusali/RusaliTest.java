/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rusali;

import java.util.Scanner;

/**
 *
 * @author Vito
 */
public class RusaliTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tentukan harga makanan, minuman dan snack"); //contoh 21000\n 5000\n 7000\n
          
        RusaliMakanan makan1 = new RusaliMakanan(4, 3, 3);
        RusaliMinuman minum1 = new RusaliMinuman(4, 3, 3);
        RusaliSnack snack1 = new RusaliSnack(4, 3, 2);
        
        //casting/conversion
        makan1.setHargaMakanan(Integer.parseInt(input.nextLine()));
        minum1.setHargaMinuman(Integer.parseInt(input.nextLine()));
        snack1.setHargaSnack(Integer.parseInt(input.nextLine()));
        
        makan1.setDiskonRate(5000);
        makan1.cetakBiayaMakan("MAKANMURAH");
        System.out.println(makan1.cetakDetilPesanan());
        
        minum1.setDiskonRate(1000);
        minum1.cetakBiayaMinum();
        System.out.println(minum1.cetakDetilPesanan());
        
        snack1.setDiskonRate(2500);
        snack1.cetakBiayaSnack("SNACKMURAH");
        System.out.println(snack1.cetakDetilPesanan());
        
        //overriding
        RusaliSnackBerat pesanan1 = new RusaliSnackBerat(4, 3, 1);
        RusaliSnackRingan pesanan2 = new RusaliSnackRingan(4, 3, 1);
        System.out.println(pesanan1.cetakDetail());
        System.out.println(pesanan2.cetakDetail());
    }
}
