import java.util.Scanner;

public class Parkir14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0, totalHarian = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis > 2 || jenis < 0) {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                System.out.println("");
                continue;
            }

            if (jenis == 0) {
                System.out.println("Total biaya parkir hari ini: Rp " + totalHarian);
                System.out.println("Terima kasih telah menggunakan jasa parkir.");
                break;
            }

            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total = 12500;
                totalHarian += total;
            }
            else if (jenis == 1) {
                total = durasi * 3000;
                totalHarian += total;
            } else  {
                total = durasi * 2000;
                totalHarian += total;
            }

            System.out.println("Total biaya parkir: Rp " + total);
            System.out.println("");
        }
        
        sc.close();
    }
}