## Object-oriented Programming (Lab Work) Template Guides
//Created by 21343038_AbelLevran
1. pada jobsheet 5 ini kita membuat source code tentang implementasi/pengaplikasian dari class Scanner, BuffreadReader, dan JOptionPane
2. Pada pengaplikasian kelas Scanner, hal utama sekali adalah deklarasi atau meng-import nya dengan sintax --> import java.util.Scanner, diatas sintax nama class/file.
3. deklarasi dalam class/file adalah dengan sintax --> Scanner in = new Scanner(System.in)
4. Scanner in --> variabel yang bernama in bertipe scanner
5. new Scanner(System.in) --> membuat sebuah objek bertipe Scanner
6. Kelas Scanner mempunyai method yang berbeda untuk membaca tipe data yang berbeda yang diinputkan melalui keyboard, pada source yang kita buat yaitu:
7. public String nextLine() : memindahkan pemindai ke baris berikutnya dan mengembalikan input yang dilewati.
8. public int nextInt() : memindai data dengan tipe data Integer
9. public float nextFloat() : memindai data dengan tipe data Float
10. Pada class BufferedReader juga ada fungsi untuk menerima inputan dari keyboard yaitu dengan fungsi readLine(). 
11. Hal yg utama juga dri pengaplikasian kelas BuffreadReader ialah mengimport dengan sintax;
12. import java.io.BufferedReader;
13. import java.io.InputStreamReader;
14. import java.io.IOException;
15. pada kelas buffreadreader ini misalnya pada Latihan4 kita buat variabel tipe data string dan harus membuatnya menjadi tipe data float, maka kita perlu mengkonversi tipe data string ke tipe data float, contoh sintaxnya -->  
16. angka1 = Float.parseFloat(a);
17. jika konversi ke tipe int maka --> angka1 = Int.parseInt(a) dan lain"nya..
18. Kelas JOptionPane adalah memunculkan dialog box ke user untuk proses input dan mendapatkan suatu nilai atau informasi. 
19. import JOptionPane dengan sintas import javax.swing.JOptionPane
20. contohnya terdapat pada Latihan5

