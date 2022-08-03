import java.util.Scanner;

public class anybaseaddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int anb = getvalueofanybase(b,n1,n2);
        System.out.println(anb);
    }
    public static int getvalueofanybase(int b,int n1,int n2){

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
    

