import java.util.Scanner;

public class decimaltoanybase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int dn = getvalueinbase(n,d);
        System.out.println(dn);
    }
    public static int getvalueinbase(int n, int d ){
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%d;
            n = n/d;

            rv += dig*p;
            p = p*10;
        }


        return rv;
    }

}
    

