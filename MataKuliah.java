/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author User
 */
public class MataKuliah {
    String kode_mk;
    String nama_mk;

    public MataKuliah(String kode_mk, String nama_mk) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
    }

    public void tampil() {
        System.out.println("Kode Matakuliah : " + kode_mk);
        System.out.println("Nama Matakuliah : " + nama_mk);
    }
}
