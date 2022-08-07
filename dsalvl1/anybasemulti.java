import java.nio.file.ProviderMismatchException;
import java.util.Scanner;

public class anybasemulti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();//base number for converting
        int n1 = scn.nextInt();//n1 is first number u want take as a multiplw
        int n2 = scn.nextInt();
        int d = getproduct(b,n1,n2);
        System.out.println(d);
        
    }
    public static int getproduct(int b, int n1 , int n2 ){
     int rv = 0;
     int c =0;
     int p = 1;
      while(n2>0){
      int d2 = n2%10;
      n2=n2/10;

    int sprd = getprodwithsingledigit(b, n1, d2);
    rv = getsum(b,rv,sprd*p);
    p = p*10;
}


return rv;
    }
    public static int getprodwithsingledigit(int b, int n1, int d2){
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1>0 || c>0){
            int d1 = n1%10;
            n1 = n1/10;
            int d = d1*d2+c;
            c = d/b;
            d = d%b;
            rv += d *p;
            p=p*10;


        }
        return rv;
    }
    public static int getsum(int b,int n1,int n2){

        int rv = 0;
            int v=0;
           int p = 1;
     while(n1>0 || n2>0 || v>0){
         int d1 = n1%10;//modulus/reminder of d1
         int d2 = n2%10;//modulus of d2
         n1 = n1/10;//shortest value of n1
         n2 = n2/10;//shortest value of n2
         int d = d1+d2+v;
         v = d/b;
         d = d%b;
         rv += d*p;
         p = p*10;
     
     
     }
     return rv;
     
    }
    
}
