package kuis1;

import java.util.Scanner;

public class pegawaiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("Masukkan Jumlah Pegawai: ");
        int x = sc.nextInt();
        pegawai[] pg = new pegawai[x];

        for (int i = 0; i < pg.length; i++) {
            pg[i] = new pegawai();
            System.out.println("==============================");
            System.out.print("Masukkan Nama Pegawai: ");
            pg[i].nama = sc.next();
            System.out.print("Masukkan Masa Kerja Tahun Pegawai: ");
            pg[i].masaKerjaThn = sc.nextInt();
            System.out.print("Masukkan Jam Lembur Pegawai: ");
            pg[i].jamLembur = sc.nextDouble();
            System.out.print("Masukkan Gaji Pokok Pegawai: ");
            pg[i].gajiPokok = sc.nextInt();
            System.out.println("==============================");
        }

        for (int i = 0; i < pg.length; i++) {
            pg[i].hitungGajiLembur();
            pg[i].hitungTunjangan();
            pg[i].hitungGajiTotal();
        }

        for (int i = 0; i < pg.length; i++) {
            System.out.println("==============================");
            System.out.println("Nama pegawai: " +pg[i].nama);
            System.out.println("Masa Kerja: " +pg[i].masaKerjaThn+ " tahun");
            System.out.println("Jam Lembur: " +pg[i].jamLembur);
            System.out.println("Gaji Pokok: " +pg[i].gajiPokok);
            pg[i].printData();
            System.out.println("==============================");
        }
        sc.close();
    }
}
