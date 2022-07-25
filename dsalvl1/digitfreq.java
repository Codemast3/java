import java.util.Scanner;

public class digitfreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getdigitfrequency(n,d);
        System.out.println(f);

    }
    public static getdigitfrequency(int n ,int d ){
       int rv=0;//return value 
       whlie(n>0)
       {
        int dig = n % 10; //modulus of n by 10 
        n=n/10;//shortest value of n 

        
        if(dig == d ){
            rv++;

        }
       }
     }
}


