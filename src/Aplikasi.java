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
public class Aplikasi {
    public static void main(String[] args)
    {
       //Mengsisi Identitas
       String identitas = "Zalsa Aquarista Kusumaningtyas / X RPL 3 / 39";
       System.out.println("Identitas: " + identitas);
       String u = "tidak" ;
       String l ="ya" ;
       Scanner baca = new Scanner(System.in);
       String[] makan = new String[] {"Nasi pecel", "Gado-gado", "Nasi Campur", "Soto ayam", "Bakso"};
       System.out.print("Masukkan jenis makanan: ");
       String i = baca.nextLine();
       int y = 0;
       
       for(int x = 0; x < 5; x++)
       {
           if(i.equalsIgnoreCase(makan[x]))
           {
               y = 1;
           }
       
       }
       
       if(y == 1)
        {
            System.out.println("Makanan yang dipesan tersedia");
        }
       
        else
        {
            System.out.println("Makanan yang dipesan tidak tersedia");
        }
       
       String r = "  ";
       System.out.print("Apakah anda ingin memesan yang lain: ");
       String jawaban = baca.nextLine();
       
       if(jawaban.equals(l))
       {
           System.out.print("Tuliskan pesanan yang anda ingin: ");
           String pesanan = baca.nextLine();
           System.out.println("Pesanan anda akan segera dilaksanakan");
       }
       else if(jawaban.equals(u))
       {
           System.out.println("Terima kasih karena telah memesan");
       }
       
       System.out.println("Bandingkan karakter i dan r: " + i.compareTo(r));
       System.out.println("Pada r terdapat huruf 'i': " + r.contains(r));
       System.out.println("r adalah kosong: " + r.isEmpty());
         }
}
