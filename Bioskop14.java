import java.util.Scanner;

public class Bioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double hargaTiket = 50000;
        double totalPendapatan = 0;
        int totalTiketTerjual = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("\nMenghitung harga.");
                System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
                System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);
                break;
            }

            double totalHarga = hargaTiket * jumlahTiket;

            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;
            }

            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println();

            totalPendapatan += totalHarga;
            totalTiketTerjual += jumlahTiket;
        }

        sc.close();
    }
}