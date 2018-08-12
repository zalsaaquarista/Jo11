/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ConvertVocal2Angka {
   private static void tampilJudul(String identitas)
   {
       System.out.println("Identitas: " + identitas);
       System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");       
   }
   public static void main(String[] args)
   {
       String identitas = "Zalsa Aquarista Kusumaningtyas / X RPL 3 / 39";
       tampilJudul(identitas);
   }
}
