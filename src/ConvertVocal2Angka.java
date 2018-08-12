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
    private static void tampilJudul(String[] args)
    {
       System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
       String identitas = "nama lengkap / kelas / no";
       System.out.println("identitas: " + identitas); 
    }
    
    private static String tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli: " + kalimat);
        
        return kalimat;
    }
    
    private static String vocal2Angka(String kalimat)
    {
      
    }
    

