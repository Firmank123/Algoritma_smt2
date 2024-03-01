package job1;

import java.util.Scanner;

public class tugas2 {
    double waktu, jarak, kecepatan;
    Scanner input = new Scanner(System.in);
    public tugas2() {

    }

    void menu() {
        while (true) {
            // Tampilan menu
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    hitungKecepatan(input);
                    break;
                case 2:
                    hitungJarak(input);
                    break;
                case 3:
                    hitungWaktu(input);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    void hitungKecepatan(Scanner input) {
        System.out.print("Masukkan kecepatan (m/s): ");
        kecepatan = input.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        waktu = input.nextDouble();

        jarak = kecepatan * waktu;
        System.out.println("Jarak = " + jarak + " meter");

    }

    void hitungJarak(Scanner input) {
        System.out.print("Masukkan jarak (m): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu = " + waktu + " detik");

    }

    void hitungWaktu(Scanner input) {
        System.out.print("Masukkan jarak (m): ");
        jarak = input.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        waktu = input.nextDouble();

        kecepatan = jarak / waktu;
        System.out.println("Kecepatan = " + kecepatan + " m/s");
    }
}
