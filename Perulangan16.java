import java.util.Scanner;
public class Perulangan16 {
    public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
    System.out.println("Masukan Nim :");
    String nim = sc16.nextLine();
    int n = Integer.parseInt(nim.substring(nim.length() -2));
        if (n<10){
            n+=10;
        }int i;
            for (i=1; i<=n; i++){
                if(i !=6 && i!=10){
                    if (i %2 ==0){
                        System.out.print(i+"");
                    }else{
                        System.out.print("*");                }
                }
            }
    sc16.close();
    }
    
}
