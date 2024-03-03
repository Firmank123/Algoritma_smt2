package week2;

public class bukuMain16 {
    public static void main(String[] args) {
        buku16 bk1 = new buku16();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 192;
        bk1.stok = 13;
        bk1.harga = 25000;
        bk1.jml = 4;

        bk1.terjual();
        bk1.hitungHargaTotal();
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        /* buku16 bk2 = new buku16("Hidup Sehat", "Firmansyah", 179, 59, 99000);
        bk2.terjual(59);
        bk2.tampilInformasi(); */
    }
}
