package job1;

import java.util.Scanner;

public class nilai {
    float uas, uts, kuis, tugas, total;

    public nilai() {

    }

    void inputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai UAS          : ");
        float uas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS          : ");
        float uts = input.nextFloat();
        System.out.print("Masukkan Nilai Kuis         : ");
        float kuis = input.nextFloat();
        System.out.print("Masukkan Nilai Tugas        : ");
        float tugas = input.nextFloat();
        
        total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        
        if (uas > 100 || uts > 100 || tugas > 100 || kuis > 100) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Input tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            inputNilai();
        }
        input.close();
    }

    void hitungTotal(String message) {
        if (total <= 100 && total > 80) {
            message = "A";
        } else if (total <= 80 && total > 73) {
            message = "B+";
        } else if (total <= 73 && total > 65) {
            message = "B";
        } else if (total <= 65 && total > 60) {
            message = "C+";
        } else if (total <= 60 && total > 50) {
            message = "C";
        } else if (total <= 50 && total > 39) {
            message = "D";
        } else if (total <= 39) {
            message = "E";
        }
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Nilai akhir: " +total);
        System.out.println("Nilai Huruf: " +message);
        System.out.println("==============================");
        System.out.println("==============================");
    }

    void kelulusan() {
        if (total <= 50) {
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}
