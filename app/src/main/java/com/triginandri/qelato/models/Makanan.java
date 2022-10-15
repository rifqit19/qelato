package com.triginandri.qelato.models;

public class Makanan {

    public String nama;
    public String deskripsi;
    public int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public int gambar;


    public Makanan(String nama, int harga, String deskripsi, int gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

}
