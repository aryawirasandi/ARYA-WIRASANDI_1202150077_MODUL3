package com.example.arya.aryawirasandi_1202150077_modul3;

/**
 * Created by arya on 24/02/18.
 */

public class menu {
//   Deklarasi variabel
    int gambar;
    String nama;
    String description;
//  Method konsturktor untuk menyimpan data
    public menu(int gambar, String nama, String description) {
        this.gambar = gambar;
        this.nama = nama;
        this.description = description;
    }
    // method getter untuk gambar, Nama. dan Description
    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getDescription() {
        return description;
    }
}


