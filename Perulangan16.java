public class Perulangan16 {
    public static void main(String[] args) {
       int n=17;
       int i;
        for (i=1; i<=n; i++){
            if(i !=6 && i!=10){
                if (i %2 ==0){
                    System.out.print(i+"");
                }else{
                    System.out.print("*");                }
            }

       }
    }
    
}
