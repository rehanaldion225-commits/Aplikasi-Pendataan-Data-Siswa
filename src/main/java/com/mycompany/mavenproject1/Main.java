/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Windows10
 */
class Siswa {                

    String nama;             
    int umur;              

    Siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanData() {  
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa("Raehan Aldion", 19);
    
      

        siswa1.tampilkanData();
    }
}