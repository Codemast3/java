import java.util.Scanner;

public class digitfreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//taking input as n
        int d = scn.nextInt();//taking digit frequency num as d
        int f = getdigitfrequency(n,d);//calling function
        System.out.println(f);

    }
    public static  int getdigitfrequency(int n ,int d ){
       int rv = 0;//return value 
       while(n>0) 
       {
        int dig = n % 10; //modulus of n by 10 
        n=n/10;//shortest value of n 

        
        if(dig == d )//logic applied
            rv++;

       
        }
       
       return rv;
    }
}




