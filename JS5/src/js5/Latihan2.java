/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//created by 21343038_AbelLevran
package js5;

/**
 *
 * @author Bellevran
 */
import java.util.Scanner;
public class Latihan2 {
    public static void main(String args[]){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.println("Masukan Angka ke-1: ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.println("Masukan Angka ke-2: ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka ke-1: "+angka1);
        System.out.println("Angka ke-2: "+angka2);
        System.out.println("Jumlah: "+jumlah);
        
        
        
    }
}
