package week2;

public class buku16 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Sisa stok: " + judul);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int jml) {
        harga = hrg;
    }
}
