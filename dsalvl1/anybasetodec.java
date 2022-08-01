import java.util.Scanner;

public class anybasetodec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int g= getvalueindec(n,b);
        System.out.println(g);
    }
    public static int getvalueindec(int n, int b){
        int rv = 0;
        int p=1;
        while(n>0){
            int dig = n%10;//reminder of n to be used in decimal 
            n = n/10;//shortest value of n 
            rv += dig*p;//logic apllied 
            p=p*b;//cause power going to multiply from base 

        }
        return rv;

    }
    }

