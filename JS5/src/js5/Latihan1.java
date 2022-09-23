/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//created by 21343038_AbelLevran
package js5;

/**
 *
 * @author Bellevran
 */

import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.println("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.println("Masukan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : "+nama +
                           "\nNIM : "+NIM +
                           "\nNilai : "+nilai);
    }
    
}
