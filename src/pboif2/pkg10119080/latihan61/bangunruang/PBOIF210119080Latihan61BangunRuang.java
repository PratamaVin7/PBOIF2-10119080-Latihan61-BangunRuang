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
public class PBOIF210119080Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        Tabung t = new Tabung(10,21);
        Kerucut k = new Kerucut(14,9);
        
        b.tampilBangunRuang();
        t.tampilBangunRuang();
        k.tampilBangunRuang();
    }
    
}