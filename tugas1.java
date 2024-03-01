package job1;

import java.util.Scanner;

public class tugas1 {
    Scanner input = new Scanner(System.in);
    String namaKota = null;
    char[] KODE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    String[][] KOTA = {
        {"BANTEN", " "},
        {"JAKARTA", " "},
        {"BANDUNG", " "},
        {"CIREBON", " "},
        {"BOGOR", " "},
        {"PEKALONGAN", " "},
        {"SEMARANG", " "},
        {"SURABAYA", " "},
        {"MALANG", " "},
        {"TEGAL", " "},
    };

    public tugas1() {

    }

    void masukPlat() {
        System.out.print("Masukkan kode plat: ");
        char inputKode = input.next().toUpperCase().charAt(0);
        for (int i =0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                namaKota = KOTA[i][0];
                break;
            }
        }

        if (namaKota != null) {
            System.out.println("Kota yang sesuai dengan kode adalah: " +namaKota);
        } else {
            System.out.println("Kode kota tidak valid!");
            masukPlat();
        }
    }
}
