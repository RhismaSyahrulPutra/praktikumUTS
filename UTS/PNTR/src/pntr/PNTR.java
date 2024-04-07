/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pntr;

import java.util.Scanner;
/**
 *
 * @author Rhisma Syahrul Putra
 */
public class PNTR {
    // PNTR = Positif, Negatif, Total, Rata-Rata
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int bilangan;
        int jumlahInput = 0;
        int jumlahBilanganPositif = 0;
        int jumlahBilanganNegatif = 0;
        int total = 0;
        
        System.out.print("Masukkan bilangan, program akan berhenti jika memasukan nilai 0: ");
        
        while((bilangan = input.nextInt()) != 0) {
            if (bilangan > 0) {
                jumlahBilanganPositif++;
            } else if (bilangan < 0) {
                jumlahBilanganNegatif++;
            }
            
            if (bilangan != 0){
                total += bilangan;
                jumlahInput++;
            }
        }
        
        if (jumlahInput == 0){
            System.out.println("Tidak ada nilai yang diinputkan.");
        }else {
            double hasilRataRata = (double) total / jumlahInput;
            
            System.out.println("Jumlah bilangan positif adalah " + jumlahBilanganPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahBilanganNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.printf("Nilai rata-rata %.2f\n", hasilRataRata);
        }
    }
    
}
