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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Tugas1b {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        String word1 = "", word2 ="", word3 ="";
        
        try {
            System.out.println("Enter Word 1 =");
            word1 = in.readLine();
            System.out.println("Enter Word 2 =");
            word2 = in.readLine();
            System.out.println("Enter Word 3 =");
            word3 = in.readLine();
        }
        catch (IOException e){
            System.out.println("ERROR!! gagal membaca keyboard");
        }
        System.out.println("\n"+word1 +" "+word2+" "+word3);
    }
}
