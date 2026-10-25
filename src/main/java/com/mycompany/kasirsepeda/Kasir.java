package com.mycompany.kasirsepeda;
public class Kasir {

    // Atribut
    private final Sepeda[] daftarSepeda;
    private final int[] jumlahBeli;

    // Constructor
    public Kasir() {
        daftarSepeda = new Sepeda[] {
            new Sepeda("Sepeda Gunung", 1500000),
            new Sepeda("Sepeda Lipat", 1200000),
            new Sepeda("Sepeda BMX", 1000000),
            new Sepeda("Sepeda Anak", 700000),
            new SepedaDiskon(
                "Sepeda Balap", 2500000, 10
            )
        };

        jumlahBeli = new int[daftarSepeda.length];
    }

    // Method menampilkan daftar sepeda
    public void tampilkanBarang() {
        System.out.println("\n=== DAFTAR SEPEDA ===");

        for (int i = 0; i < daftarSepeda.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarSepeda[i].tampilkanInfo();
        }
    }

    // Method menambahkan barang
    public void tambahBarang(int nomor, int jumlah) {
        if (nomor >= 1
                && nomor <= daftarSepeda.length
                && jumlah > 0) {

            jumlahBeli[nomor - 1] += jumlah;
            System.out.println("Barang berhasil ditambahkan!");

        } else {
            System.out.println("Nomor atau jumlah tidak valid.");
        }
    }

    // Memeriksa keranjang kosong
    public boolean keranjangKosong() {
        for (int jumlah : jumlahBeli) {
            if (jumlah > 0) {
                return false;
            }
        }

        return true;
    }

    // Method menampilkan keranjang dan total
    public int tampilkanKeranjang() {
        int total = 0;

        System.out.println("\n=== KERANJANG BELANJA ===");

        for (int i = 0; i < daftarSepeda.length; i++) {
            if (jumlahBeli[i] > 0) {

                int harga = daftarSepeda[i].hitungHarga();
                int subtotal = harga * jumlahBeli[i];

                System.out.println(
                    daftarSepeda[i].getNama()
                );
                System.out.println(
                    "Harga    : Rp" + harga
                );
                System.out.println(
                    "Jumlah   : " + jumlahBeli[i]
                );
                System.out.println(
                    "Subtotal : Rp" + subtotal
                );

                total += subtotal;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Total: Rp" + total);

        return total;
    }

    // Mengosongkan keranjang setelah transaksi berhasil
    public void resetKeranjang() {
        for (int i = 0; i < jumlahBeli.length; i++) {
            jumlahBeli[i] = 0;
        }
    }
}
