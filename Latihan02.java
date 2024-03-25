/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Indri
 * tgl:2024-03-25
 */
public class Latihan02 {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
         BufferedReader dtIN = new  BufferedReader(new InputStreamReader(System.in));
         
         String nama="";
         System.out.print("Tuliskan Nama: ");
         try{
             nama = dtIN.readLine();
            }catch(IOException e){
                System.out.println("Terjadi masalah saat mengambil data");
         }
         
         System.out.println("isi variabel nama: "+nama);
         
     }
    
}
