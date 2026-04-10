/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas01;
import akademik.Mahasiswa;
import akademik.MataKuliah;

/**
 *
 * @author User
 */
public class Tugas01 {
public static void main(String[] args) {

    Mahasiswa mhs = new Mahasiswa("2410010529", "Muhammad Firja", 3.69, 4);
    MataKuliah mk = new MataKuliah("TIF1402", "Pemrograman Berbasis Objek");

    System.out.println("\n========================================");
    System.out.println("           DATA AKADEMIK");
    System.out.println("========================================");
    mhs.tampil();
    System.out.println("\n----------------------------------------");
    mk.tampil();
    System.out.println("\n========================================");

}
}
