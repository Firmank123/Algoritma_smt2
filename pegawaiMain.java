package kuis1;

public class pegawaiMain {
    public static void main(String[] args) {
        pegawai pg = new pegawai();

        pg.masaKerjaThn=6;
        pg.jamLembur=6;
        pg.gajiPokok=2000000;


        pg.hitungGajiLembur();
        pg.hitungTunjangan();
        pg.hitungGajiTotal();
        pg.printData();
    }
}
