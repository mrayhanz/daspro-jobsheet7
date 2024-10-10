import java.util.Scanner;

public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        // modifikasi
        int jumlahLulus = 0; 
        int jumlahTidaklulus = 0;
        double batasKelulusan = 60.0;

        for(int i  = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // modifikasi
            if (nilai >= batasKelulusan) {
                jumlahLulus++;
            } else {
                jumlahTidaklulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus : " +jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidaklulus);
    }
}