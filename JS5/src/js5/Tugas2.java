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
import javax.swing.JOptionPane;
public class Tugas2 {
    public static void main(String[] args) {
        String word1 = "", word2="" , word3="";
        
        word1 = JOptionPane.showInputDialog("Enter Word 1 ! ");
        word2 = JOptionPane.showInputDialog("Enter Word 2 !");
        word3 = JOptionPane.showInputDialog("Enter Word 3 !");
        
        String pesan = word1 +" "+word2 +" "+word3;
        
        JOptionPane.showMessageDialog(null, pesan);
        System.out.println(word1 +" "+word2 +" "+word3);
    }
}
