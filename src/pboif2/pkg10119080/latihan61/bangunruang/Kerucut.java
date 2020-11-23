/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Bangun Ruang
 */
public class Kerucut implements BangunRuang{
    private int r,tinggi;
    // tinggi = 9, r = 14
    
    public Kerucut(int r,int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return (22*r*r*tinggi)/(3*7);
    }

    @Override    
    public void tampilBangunRuang() {
        System.out.printf("Hasil : V = %.0f%n", hitungVolume());
    }
    
}