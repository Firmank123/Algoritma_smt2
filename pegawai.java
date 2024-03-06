package kuis1;

public class pegawai {
    String nama;
    int masaKerjaThn, gajiPokok;
    double tunjangan, gajiTotal;
    double gajiLembur;
    double jamLembur;

    public pegawai() {

    }

    double hitungGajiLembur() {
        if (masaKerjaThn < 5) {
            gajiLembur=jamLembur*(0.05*gajiPokok);
        } else if (masaKerjaThn > 5) {
            gajiLembur=jamLembur*(0.10*gajiPokok);
        }
        return 0;
    }

    double hitungTunjangan() {
        if (masaKerjaThn < 5) {
            tunjangan=0.25*gajiPokok;
        } else if (masaKerjaThn > 5) {
            tunjangan=0.50*gajiPokok;
        }
        return 0;
    }

    double hitungGajiTotal() {
        gajiTotal=gajiPokok + gajiLembur + tunjangan;
        return gajiLembur;
    }

    void printData() {
        System.out.println("Gaji total anda adalah: " +gajiTotal);
    }
}
