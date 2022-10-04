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
        System.out.println("Tentukan harga makanan");
        System.out.println("Tentukan harga minuman");
        System.out.println("Tentukan harga snack");
        
        Rusali p1 = new Rusali(2, 5);
        p1 = new RusaliSnack(2, 5, 2, 2);
        p1 = new
        
        RusaliMakanan makan1 = new RusaliMakanan(3, 10, 3);
        RusaliMinuman minum1 = new RusaliMinuman(3, 10, 3);
        makan1.setHargaMakanan(Integer.parseInt(input.nextLine()));
        makan1.cetakBiayaMakan();
    }
}
