/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
       System.out.println("Identitas: " + identitas);
       System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");       
    }
    private static String tampilInput()
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Masukkan Kalimat: ");
       String kalimat = scanner.nextLine();
       System.out.println("Kalimat Asli: " + kalimat);
       
       return kalimat;
    }
}
