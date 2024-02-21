import java.util.Scanner;
/**
 * Pemilihan16
 */
public class Pemilihan16 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        int uts, kuis, uas, tugas;
        double nilAkh;
        String nilHuruf;
        System.out.println("Program Menghitung nilai akhir");
        System.out.println("---------------------------------");
        System.out.println("Masukan Nilai Tugas :");
        tugas = sc16.nextInt();
        System.out.println("Masukan Nilai Kuis :");
        kuis = sc16.nextInt();
        System.out.println("Masukan Nilai UTS :");
        uts = sc16.nextInt();
        System.out.println("Masukan Nilai UAS :");
        uas = sc16.nextInt();
        System.out.println("---------------------------------");

        if (tugas < 0||tugas >100||kuis<0||kuis>100||uts<0||uts>100||uas<0||uas>100){
            System.out.println("Nilai Tidak Falid");
        }else{
            nilAkh = (0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.3*uas);
            System.out.println("Nilai akhir = "+nilAkh);
            if (nilAkh>80){
                nilHuruf = "A";
            }else if(nilAkh>73||nilAkh<=80){
                nilHuruf = "B+";
            }else if(nilAkh>65||nilAkh<=73){
                nilHuruf = "B";
            }else if(nilAkh>60||nilAkh<=65){
                nilHuruf = "C+";
            }else if(nilAkh>50||nilAkh<=60){
                nilHuruf = "C";
            }else if(nilAkh>39||nilAkh<=50){
                nilHuruf = "D";
            }else{
                nilHuruf = "E";
            }
            System.out.println("Nilai Huruf = "+ nilHuruf);
            System.out.println("-----------------------------------");
            if (nilHuruf.equals("D")||nilHuruf.equals("E")){
                System.out.println("TIDAK LULUS");
            }else{
                System.out.println("LULUS");
            }


        }
        sc16.close();
    }
}
