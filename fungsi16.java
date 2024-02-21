public class fungsi16 {
    // Harga bunga per potong
    private static final int[] HARGA_BUNGA = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

    // Jumlah stok bunga di setiap cabang
    private static int[][] STOK_BUNGA = {
            {10, 5, 15, 7}, // Cabang 1
            {6, 11, 9, 12}, // Cabang 2
            {2, 10, 10, 5}, // Cabang 3
            {5, 7, 12, 9}   // Cabang 4
    };

    // Nama bunga
    private static final String[] NAMA_BUNGA = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    // Nama cabang
    private static final String[] NAMA_CABANG = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public static void tampilkanPendapatan() {
        for (int i = 0; i < NAMA_CABANG.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < HARGA_BUNGA.length; j++) {
                pendapatanCabang += STOK_BUNGA[i][j] * HARGA_BUNGA[j];
            }
            System.out.println("Pendapatan " + NAMA_CABANG[i] + ": Rp" + pendapatanCabang);
        }
    }

    // Fungsi untuk mengurangi stok bunga karena bunga tersebut mati
    public static void kurangiStokBungaCabang4(String jenisBunga, int jumlah) {
        int indexBunga = -1;
        for (int j = 0; j < NAMA_BUNGA.length; j++) {
            if (NAMA_BUNGA[j].equals(jenisBunga)) {
                indexBunga = j;
                break;
            }
        }
        if (indexBunga != -1) {
            STOK_BUNGA[3][indexBunga] -= jumlah;
            System.out.println("Stok bunga " + jenisBunga + " di " + NAMA_CABANG[3] + " dikurangi sebanyak " + jumlah);
        } else {
            System.out.println("Jenis bunga tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        // Tampilkan pendapatan setiap cabang jika semua bunga habis terjual
        tampilkanPendapatan();

        // Contoh pengurangan stok bunga karena bunga mati hanya pada Cabang 4
        kurangiStokBungaCabang4("Aglonema", 1);
        kurangiStokBungaCabang4("Keladi", 2);

        // Tampilkan stok setiap jenis bunga pada setiap cabang setelah pengurangan
        System.out.println("\nStok bunga setelah pengurangan:");
        tampilkanStokBunga();
    }
}
