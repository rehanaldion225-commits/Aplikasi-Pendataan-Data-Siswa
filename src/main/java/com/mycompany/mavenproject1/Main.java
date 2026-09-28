/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

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

        System.out.println("\nData Siswa Aktif:");

        SiswaAktif siswa2 = new SiswaAktif(
                "Dandi",
                19,
                "TI 3"
        );

        siswa2.tampilkanData();
    }
}