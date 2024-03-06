package kuis1;

import java.util.Scanner;

public class pegawai {
    String nama;
    int masaKerjaThn, gajiPokok;
    double jamLembur, tunjangan, gajiTotal, gajiLembur, gajiTotalRata, terbesar;

    Scanner sc = new Scanner(System.in);

    public pegawai() {

    }

    double hitungGajiLembur() {
        if (masaKerjaThn < 5) {
            gajiLembur=jamLembur*(0.05*gajiPokok);
        } else if (masaKerjaThn > 5) {
            gajiLembur=jamLembur*(0.10*gajiPokok);
        }
        return gajiLembur;
    }

    double hitungTunjangan() {
        if (masaKerjaThn < 5) {
            tunjangan=0.25*gajiPokok;
        } else if (masaKerjaThn > 5) {
            tunjangan=0.50*gajiPokok;
        }
        return tunjangan;
    }

    double hitungGajiTotal() {
        gajiTotal=gajiPokok + gajiLembur + tunjangan;
        return gajiTotal;
    }

    void printData() {
        System.out.println("Gaji total anda adalah: " +gajiTotal);
    }
}
