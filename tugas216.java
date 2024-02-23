import java.util.Scanner;
public class tugas216 {
    public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
    System.out.println("Pilih Perhitungan yang anda inginkan");
    System.out.println("1. Menghitung Kecepatan");
    System.out.println("2. Menghitung Jarak");
    System.out.println("3. Menghitung Waktu");
    System.out.println("Pilihan Ke : ");
    int pilihan = sc16.nextInt();

        switch (pilihan){
            case 1:
                Kecepatan();
                break;
            case 2:
                jarak();
                break;
            case 3:
                waktu();
                break;
            default:
                System.out.println("Masukan pilihan yang ada");
        }
    sc16.close();
    }
    public static void Kecepatan() {
        Scanner sc16 = new Scanner(System.in);
        System.out.print("Masukkan jarak : ");
        double s = sc16.nextDouble();
        System.out.print("Masukkan waktu : ");
        double t = sc16.nextDouble();
        
        double v = s / t;
        System.out.println("Kecepatan = " + v);
    }
    public static void jarak(){
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Masukan kecepatan : ");
        double v = sc16.nextDouble();
        System.out.println("Masukan waktu : ");
        double t = sc16.nextDouble();

        double s = v*t;
        System.out.println("Jarak : "+s);
    }
    public static void waktu(){
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Masukan Jarak : ");
        double s = sc16.nextDouble();
        System.out.println("Masukan Kecepatan : ");
        double v = sc16.nextDouble();

        double t = s/v;
        System.out.println("Waktu : "+t);
    }
}
