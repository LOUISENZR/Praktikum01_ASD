import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        String[] namaMataKuliah = new String[jumlahMataKuliah];
        double[] sksMataKuliah = new double[jumlahMataKuliah];
        int[] nilaiAngka = new int[jumlahMataKuliah];

        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            scanner.nextLine(); 
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan bobot SKS mata kuliah ke-" + (i + 1) + ": ");
            sksMataKuliah[i] = scanner.nextDouble();
            System.out.print("Masukkan nilai angka mata kuliah ke-" + (i + 1) + ": ");
            nilaiAngka[i] = scanner.nextInt();
        }

        double totalNilai = 0;
        double totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilai += getNilaiHuruf(nilaiAngka[i]) * sksMataKuliah[i];
            totalSKS += sksMataKuliah[i];
        }

        // Menghitung IPK
        double ipk = totalNilai / totalSKS;
        System.out.println("IPK Anda: " + String.format("%.2f", ipk));

        scanner.close();
    }

    // Metode untuk mengonversi nilai angka menjadi nilai huruf
    public static double getNilaiHuruf(int nilaiAngka) {
        if (nilaiAngka >= 80) return 4.0;
        else if (nilaiAngka >= 73) return 3.5;
        else if (nilaiAngka >= 65) return 3.0;
        else if (nilaiAngka >= 60) return 2.5;
        else if (nilaiAngka >= 50) return 2.0;
        else if (nilaiAngka >= 39) return 1.0;
        else return 0.0;
    }
}
