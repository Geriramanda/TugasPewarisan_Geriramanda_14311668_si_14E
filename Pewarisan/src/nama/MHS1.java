/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nama;

import nama.Mahasiswa;

/**
 *
 * @author owner
 */
public class MHS1 extends Mahasiswa {

    public static void main(String[] args) {
        MHS1 m = new MHS1();
        m.setNim(14311668);
        m.setNama("Geri Ramanda");
        m.setJurusan("Sistem Informasi");
        m.setKelas("Si 14 E");
        System.out.println("Nim      :"+m.getNim());
        System.out.println("Nama     :"+m.getNama());
        System.out.println("Jurusan  :"+m.getJurusan());
        System.out.println("Kelas  :"+m.getKelas());
    }
}
