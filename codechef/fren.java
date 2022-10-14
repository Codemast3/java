

import java.util.Scanner;

public class fren {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for( int i = 0 ; i<n; i++)
        {
            int x = scn.nextInt();

                if (x>=64 && n<45000){
            System.out.println("yes");
        } else {
            System.out.println("no");
            
        }

        }
    }
}
    

