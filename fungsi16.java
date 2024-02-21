public class fungsi16 {
    private static final int[] HARGA_BUNGA = {75000, 50000, 60000, 10000};
    private static final int[][] STOK_BUNGA = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };
    private static final String[] NAMA_BUNGA = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    private static final String[] NAMA_CABANG = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

    public static void tampilkanPendapatan() {
        for (int i = 0; i < NAMA_CABANG.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < HARGA_BUNGA.length; j++) {
                pendapatanCabang += STOK_BUNGA[i][j] * HARGA_BUNGA[j];
            }
            System.out.println("Pendapatan " + NAMA_CABANG[i] + ": Rp" + pendapatanCabang);
        }
    }

    public static void tampilkanStokBunga() {
        System.out.println("Jumlah Stok Bunga di Cabang Royal Garden4:");
        for (int i = 3; i < NAMA_CABANG.length; i++) {
            System.out.println(NAMA_CABANG[i] + ":");
            for (int j = 0; j < NAMA_BUNGA.length; j++) {
                int stokBunga = STOK_BUNGA[i][j];
                // Pengurangan stok karena bunga mati hanya di cabang keempat
                if (i == 3) {
                    if (NAMA_BUNGA[j].equals("Aglonema")) {
                        stokBunga -= 1;
                    } else if (NAMA_BUNGA[j].equals("Keladi")) {
                        stokBunga -= 2;
                    } else if (NAMA_BUNGA[j].equals("Mawar")) {
                        stokBunga -= 5;
                    }
                }
                System.out.println("- " + NAMA_BUNGA[j] + ": " + stokBunga);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatan();
        System.out.println();
        tampilkanStokBunga();
    }
}
