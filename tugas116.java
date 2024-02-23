import java.util.Scanner;
public class tugas116 {
    public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
     char KODE[]= {'A','B','D','E','F','G','H','L','N','T'};
     char KOTA[][]={{'B','A','N','T','E','N'},{'J','A','K','A','R','T','A'},{'B','A','N','D','U','N','G'},
     {'C','I','R','E','B','O','N'},{'B','O','G','O','R'},{'P','E','K','A','L','O','N','G','A','N'},
     {'S','E','M','A','R','A','N','G'},{'S','U','R','B','A','Y','A'},{'M','A','L','A','N','G'},{'T','E','G','A','L'}};
     
     System.out.println("Masukan kode plat nomor : ");
     char code = sc16.next().charAt(0);   
     
     int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == code) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Nama kota: " + String.valueOf(KOTA[index]));
        } else {
            System.out.println("Kode plat nomor tidak terdaftar.");
        }
    sc16.close();
    }

}
