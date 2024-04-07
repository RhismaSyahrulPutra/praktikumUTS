/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bulanrandom;

import java.util.Random;
/**
 *
 * @author Rhisma Syahrul Putra
 */
public class BulanRandom {
    public static void main(String[] args) {
        // Membuat Array dari bulan yang akan dikeluarkan
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", 
                              "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        Random acak = new Random();
        
        int urutanBulan = acak.nextInt(12) + 1;
        
        System.out.println("Hasil Melakukan pengacakan pada bilangan:");
        System.out.println("Nomor Bulan\t: " + urutanBulan);
        System.out.println("Nama Bulan\t: " + namaBulan[urutanBulan -1]);
    }
    
}
