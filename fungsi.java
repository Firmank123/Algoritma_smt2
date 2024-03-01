package job1;

public class fungsi {
    String Bunga[] = {"Aglonema", "Keladi","Alocasia","Mawar"};
    int stokBunga[][] = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };
    int hrgBunga[]= {75000,50000,60000,10000};

    public fungsi() {

    }

    void incomeCabang() {
        System.out.println("Pendapatan per cabang jika ludes");
        for (int i = 0; i < stokBunga.length; i++) {
            int income[] = new int[4];
            for (int j = 0; j < stokBunga[0].length; j++) {
                income[i] += stokBunga[i][j] * hrgBunga[i];
            }
            System.out.println("Pendapatan cabang Royal Garden "+(i+1)+" sebesar : " +income[i]);
        }
    }

    void stokCabang() {
        int bungaMati[] = {1,2,0,5};
        int stokBaru[] = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            stokBaru[i] = stokBunga[3][i] - bungaMati[i];
            System.out.println(" > " + Bunga[i] + " : " + stokBaru[i]);
        }
    }
}
