/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limassegiempat;

/**
 *
 * @author Rhisma Syahrul Putra
 */
public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    public LimasSegiEmpat() {
        this.luasAlas = 1;
        this.luasSelubungLimas = 1;
        this.tinggi = 1;
    }

    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
    
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        printInfoLimas(limas1);
        printInfoLimas(limas2);
        printInfoLimas(limas3);
    }
    
    public static void printInfoLimas(LimasSegiEmpat limas) {
        System.out.println("Limas segi empat dengan luas alas : " + limas.luasAlas +
                ", luas selubung limas : " + limas.luasSelubungLimas +
                " dan tinggi : " + limas.tinggi +
                ". Luasnya : " + limas.getLuas() +
                ", sedangkan volumenya : " + limas.getVolume());
    }
    
}
