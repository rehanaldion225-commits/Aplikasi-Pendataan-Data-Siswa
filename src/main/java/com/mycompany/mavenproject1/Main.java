/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Windows10
 */
class Siswa {
    
    private String nama;
    private int umur;
    
    Siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh kurang dari 0");
        }
    }
    
    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Siswa siswa1 = new Siswa("Raehan Aldion", 19);
        
        System.out.println("Data awal:");
        System.out.println("Nama: " + siswa1.getNama());
        System.out.println("Umur: " + siswa1.getUmur());
        
        System.out.println("\nUbah umur menjadi 20");
        siswa1.setUmur(20);
        System.out.println("Umur sekarang: " + siswa1.getUmur());
        
        System.out.println("\nCoba ubah umur menjadi -5");
        siswa1.setUmur(-5);
        
        System.out.println("\nData akhir:");
        siswa1.tampilkanData();
    }
}