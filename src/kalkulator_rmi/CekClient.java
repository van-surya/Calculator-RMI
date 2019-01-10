/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_rmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/**
 *
 * @author 0cil650
 */
public class CekClient {
    int a,b;
    String tanya;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public void menu() throws IOException, NotBoundException{
        Fungsi f = (Fungsi) Naming.lookup("rmi://localhost:123/data");
        System.out.println("Kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Pilih perhitungan = ");
        int pilih = Integer.parseInt(br.readLine());
        switch(pilih){
            case 1:
                System.out.println("Masukan Angka Pertama\t:");
                a=Integer.parseInt(br.readLine());
                System.out.println("Masukan Angka Kedua\t:");
                b=Integer.parseInt(br.readLine());
                System.out.println("Hasilnya adalah : "+f.tambah(a, b));
                new CekClient().keluar();
                break;
             case 2:
                System.out.println("Masukan Angka Pertama\t:");
                a=Integer.parseInt(br.readLine());
                System.out.println("Masukan Angka Kedua\t:");
                b=Integer.parseInt(br.readLine());
                System.out.println("Hasilnya adalah : "+f.kurang(a, b));
                new CekClient().keluar();
                break;
             case 3:
                System.out.println("Masukan Angka Pertama\t:");
                a=Integer.parseInt(br.readLine());
                System.out.println("Masukan Angka Kedua\t:");
                b=Integer.parseInt(br.readLine());
                System.out.println("Hasilnya adalah : "+f.kali(a, b));
                new CekClient().keluar();
                break;
            case 4:
                System.out.println("Masukan Angka Pertama\t:");
                a=Integer.parseInt(br.readLine());
                System.out.println("Masukan Angka Kedua\t:");
                b=Integer.parseInt(br.readLine());
                System.out.println("Hasilnya adalah : "+f.bagi(a, b));
                new CekClient().keluar();
                break;
        }
        if(pilih>4){
            System.out.println("Pilihan tidak ada");
            menu();
        }
    }
        
     public void keluar() throws IOException, NotBoundException{
         System.out.println("Apakah Anda ingin melakukan operasi lagi ? Y/T");
         tanya =br.readLine();
         if(tanya.equals("Y")){
             new CekClient().menu();
         }else if (tanya.equals("T")){
             System.exit(0);
         }
         
     }  
     
     public static void main(String[]args) throws IOException, NotBoundException{
         CekClient c = new CekClient();
         c.menu();
     }
  
}
    