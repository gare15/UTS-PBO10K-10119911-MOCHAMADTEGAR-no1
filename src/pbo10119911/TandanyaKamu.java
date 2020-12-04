/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Mochamad Tegar
 * NIM   : 10119911
 * Kelas : IF 10K
 */
public class TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang, umur;
        String normal = "\u001b[0m";
        String merah = "\u001B[31m";

        tahunSekarang = Year.now().getValue();
        Age user = new Age(tahunSekarang);

        System.out.print("Masukkan Tahun Lahir Anda :  ");
        user.setYearBirth(scanner.nextInt());
        tahunLahir = user.getYearBirth();
        umur = user.hitungUmur();

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+ tahunLahir);
        System.out.println("Hari ini tahun : "+tahunSekarang);
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", umur);
        System.out.println("Tandanya Kamu "+ merah+ user.tandanyaKamu(umur)+ normal);
    }
    
}
