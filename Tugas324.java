import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemuaBarang = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            do {

                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;
                do {
                    System.out.print("Masukkan jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            totalSemuaBarang += totalBarangToko;

            if (i == 1 || totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }

            System.out.println("Toko " + i + "- pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
        }

        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
