package job1;

public class fungsiMain {
    public static void main(String[] args) {
        fungsi garden = new fungsi();

        System.out.println("================================================================");
        System.out.println("|    RINCIAN PENDAPATAN CABANG ROYAL GARDEN DAN STOCK BUNGA    |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println();
        System.out.println("1. Pendapatan setiap cabang jika semua bunga habis ");
        garden.incomeCabang();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("2. Jumlah stock setiap jenis bunga pada cabang royalgarden 4");
        garden.stokCabang();
    }   
}
