import java.util.Scanner;
public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {  
                System.out.println("Transaksi dibatalkan.");
                break; 
            }
            System.out.println("Masukkan jumlah kopi yang dipesan: ");
            kopi = sc.nextInt();
            System.out.println("Masukkan jumlah teh yang dipesan: ");       
            teh = sc.nextInt();
            System.out.println("Masukkan jumlah roti yang dipesan: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
    }
}