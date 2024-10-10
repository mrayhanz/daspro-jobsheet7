import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total = 0;
        int biaya = 0;

        while (true) {
        System.out.print("Masukkan jenis Kendaraan (1 untuk mobil,2 untuk motor, 0 untuk keluar): ");
        jenis = sc.nextInt();

        if (jenis == 0) {
            break;
        }

        if (jenis != 1 && jenis !=2) {
            System.out.println("Jenis kendaraan tidak valid.");
            continue;
        }
        
        System.out.print("Masukkan Durasi parkir dalam jam: ");
        durasi = sc.nextInt();

        if (durasi>5) {
            biaya = 12500;
        } else {
            if (jenis == 1) {
                biaya = durasi * 3000;
            }else if (jenis == 2) {
                biaya = durasi * 2000;
            }
        }
        
        total += biaya;
        System.out.println("Biaya Parkir untuk kendaraan ini: Rp" + biaya);
        }

        System.out.println("Total Pembayaran parkir: Rp" + total);
    }
}
