/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digits;

import java.util.Scanner;
/**
 *
 * @author Rhisma Syahrul Putra
 */
public class Digits {
    public static int sumDigits(long n) {
        int jumlah = 0;

        while (n != 0) {
            int digit = (int) (n % 10);
            
            jumlah += digit;
            
            n /= 10;
        }

        return jumlah;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Sebuah Bilangan Bulat\t: ");
        long n = input.nextLong();
        
        int jumlahDigit = sumDigits(n);
        
        System.out.println("Jumlah digit dalam bilangan " + n + " adalah " + jumlahDigit);
        
        input.close();
    }
    
}
