import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
        String[] namaMK = {"Pancasila","Konsep Teknologi Informasi",
        "Critical Thinking and Problem Solving","Matematika Dasar",
        "Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman",
        "Kesehatan dan Keselamatan Kerja"};

        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        String[] kualifikasi = new String[8];
        double[] bobotSks = new double[8];

        System.out.println("---------------------------------------");
        System.out.println("    PROGRAM MENGHITUNG IP SEMESTER     ");
        System.out.println("---------------------------------------");

        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = sc16.nextDouble();
        }

        System.out.println("============================================================================================================");
        System.out.println("                                          Hasil Konversi Nilai                                          ");
        System.out.println("============================================================================================================");
        System.out.printf("| %-40s | %-12s | %-12s | %-12s |\n", "Mata Kuliah","Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("|------------------------------------------|--------------|--------------|--------------|------------------|");

        double totalBobotSks = 0;
        double totalNilai = 0;

        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotSks[i] = 4.0;
                kualifikasi[i] = "Sangat Baik";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotSks[i] = 3.5;
                kualifikasi[i] = "Lebih dari Baik";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotSks[i] = 3.0;
                kualifikasi[i] = "Baik";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotSks[i] = 2.5;
                kualifikasi[i] = "Lebih dari Cukup";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotSks[i] = 2.0;
                kualifikasi[i] = "Cukup";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotSks[i] = 1.0;
                kualifikasi[i] = "Kurang";
            } else {
                nilaiHuruf[i] = "E";
                bobotSks[i] = 0.0;
                kualifikasi[i] = "Gagal";
            }
            totalNilai += bobotSks[i] * 3; 
            totalBobotSks += 3; 
        }

        double ipSemester = totalNilai / totalBobotSks;

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("| %-40s | %-12.2f | %-12s | %-12.2f |\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotSks[i], kualifikasi[i]);
        }
        System.out.println("================================================================================================================");
        System.out.println("IP Semester: " + ipSemester);
    

    sc16.close();
    }
}