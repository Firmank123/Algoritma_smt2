package week2;

public class buku16 {
    String judul, pengarang;
    int jml, halaman, stok, harga, hargaTotal;
    double diskon, hargaDiskon, hargaBayar;

    public buku16() {

    }

    public buku16(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + hargaTotal);
        System.out.println("Total Harga: " + hargaBayar);
    }

    void terjual() {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok buku habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal() {
        hargaTotal = harga * jml;
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            hargaDiskon = hargaTotal*0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            hargaDiskon = hargaTotal*0.05;
        } else if (hargaTotal < 75000) {
            hargaDiskon = hargaTotal*1;
        }
    }

    void hitungHargaBayar() {
            hargaBayar = hargaTotal-hargaDiskon;
    }
}
