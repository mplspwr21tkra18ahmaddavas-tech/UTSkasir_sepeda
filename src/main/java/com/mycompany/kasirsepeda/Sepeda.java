package com.mycompany.kasirsepeda;
public class Sepeda {

    // Atribut
    private final String nama;
    private final int harga;

    // Constructor
    public Sepeda(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter untuk mengakses atribut private
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Method menghitung harga
    public int hitungHarga() {
        return harga;
    }

    // Method menampilkan informasi sepeda
    public void tampilkanInfo() {
        System.out.println(
            nama + " - Rp" + hitungHarga()
        );
    }
}
