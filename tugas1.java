import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000 ;
        int totalTiket = 0;
        int jumlahTiket,penjualan = 0;
        double diskon,totalHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang di beli (-1 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket <0 ) {
                System.out.println("Jumlah Tiket tidak valid");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            }else if (jumlahTiket > 4) {
                diskon = 0.10;
            }else{
                diskon = 0.0;
            }

            totalHarga = jumlahTiket * hargaTiket - (hargaTiket * diskon);
            penjualan += totalHarga;
            totalTiket += jumlahTiket;
            
            System.out.println("Harga setelah diskon: " + totalHarga + "%");
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket : Rp" + penjualan);
    }
}
