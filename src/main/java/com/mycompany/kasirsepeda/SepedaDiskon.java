
package com.mycompany.kasirsepeda;

public class SepedaDiskon extends Sepeda {

    // Atribut diskon
    private final int diskon;

    // Constructor
    public SepedaDiskon(
        String nama, int harga, int diskon
    ) {
        super(nama, harga);
        this.diskon = diskon;
    }

    // Menghitung harga setelah diskon
    @Override
    public int hitungHarga() {
        return getHarga()
            - (getHarga() * diskon / 100);
    }
}
