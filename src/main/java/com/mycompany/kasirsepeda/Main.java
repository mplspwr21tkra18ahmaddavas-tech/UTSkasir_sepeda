package com.mycompany.kasirsepeda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Membuat object Kasir
        try (Scanner input = new Scanner(System.in)) {
            // Membuat object Kasir
            Kasir kasir = new Kasir();
            
            int pilihan;
            
            do {
                System.out.println("\n==========================");
                System.out.println("   SISTEM KASIR SEPEDA");
                System.out.println("==========================");
                System.out.println("1. Lihat Daftar Sepeda");
                System.out.println("2. Tambah ke Keranjang");
                System.out.println("3. Lihat Keranjang");
                System.out.println("4. Pembayaran");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                
                pilihan = input.nextInt();
                
                switch (pilihan) {
                    
                    case 1:
                        kasir.tampilkanBarang();
                        break;
                        
                    case 2:
                        kasir.tampilkanBarang();
                        
                        System.out.print("Nomor sepeda: ");
                        int nomor = input.nextInt();
                        
                        System.out.print("Jumlah beli: ");
                        int jumlah = input.nextInt();
                        
                        kasir.tambahBarang(nomor, jumlah);
                        break;
                        
                    case 3:
                        kasir.tampilkanKeranjang();
                        break;
                        
                    case 4:
                        if (kasir.keranjangKosong()) {
                            System.out.println(
                                    "Keranjang masih kosong."
                            );
                            break;
                        }
                        
                        int total = kasir.tampilkanKeranjang();
                        
                        System.out.print(
                                "Uang pembayaran: Rp"
                        );
                        int uang = input.nextInt();
                        
                        if (uang >= total) {
                            
                            int kembalian = uang - total;
                            
                            System.out.println(
                                    "\n=== STRUK PEMBAYARAN ==="
                            );
                            System.out.println(
                                    "Total      : Rp" + total
                            );
                            System.out.println(
                                    "Pembayaran : Rp" + uang
                            );
                            System.out.println(
                                    "Kembalian  : Rp" + kembalian
                            );
                            System.out.println("Status     : LUNAS");
                            System.out.println(
                                    "Terima kasih telah berbelanja!"
                            );
                            
                            kasir.resetKeranjang();
                            
                        } else {
                            System.out.println(
                                    "Uang tidak cukup!"
                            );
                            System.out.println(
                                    "Transaksi belum selesai."
                            );
                        }
                        break;
                        
                    case 5:
                        System.out.println(
                                "Program kasir selesai."
                        );
                        break;
                        
                    default:
                        System.out.println(
                                "Menu tidak tersedia."
                        );
                }
                
            } while (pilihan != 5);
        }
    }
}
