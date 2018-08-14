/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Aplikasi {
    public static void main(String[] args)
    {
       //Mengsisi Identitas
       String identitas = "Zalsa Aquarista Kusumaningtyas / X RPL 3 / 39";
       System.out.println("Identitas: " + identitas);
       
       String y = "SMK TELKOM MALANG";
       System.out.println("variable y: " + (y));
       System.out.println("jumlah karakter: " + y.length());
       System.out.println("jawaban y: " + y.isEmpty());
       
       String b = "SMPN 6 SIDOARJO";
       System.out.println("variable b: " + (b));
       System.out.println("jumlah karakter: " + b.length());
       System.out.println("jawaban b: " + y.isEmpty());
       
       System.out.println("Perbandingan jumlah y dan b: " + y.compareTo(b));
       System.out.println("Perbedaan tulisan y dan b: " + y.toLowerCase());
       System.out.println("Perbedaan tulisan b dan y: " + b.toLowerCase());      
    }
}
