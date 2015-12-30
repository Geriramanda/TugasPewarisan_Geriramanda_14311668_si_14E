/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nama;
// Inheritance atau Pewarisan adalah konsep dimana class superClass /class induk dapat mewariskan semua Attribut dan Method kepada subClass/class anak.
//Untuk menggunakan konsep pewarisan ini, kita harus menggunakan keyword/kata kunci extend.
/**
 *
 * @author owner
 */
 class Mahasiswa {
    private int Nim;
    private String Nama,Jurusan,kelas;
   
    public int getNim() {
        return Nim;
    }
    public void setNim(int nim) {
        Nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public String getJurusan() {
        return Jurusan;
    }
    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }
}