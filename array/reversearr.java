import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = scn.nextInt();

        // declare an array 
        int[] arr = new int[n];

        // input values 
        for (int i = 0 ; i<n;i++){
            arr[i] = scn.nextInt();

        }
        //logic for reversing an array 
        int temp;
        int start = 0;
        int end = n-1;

        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
            

             
        }
        //printing values
        System.out.println("reverse of array will be :");
        for(int j = 0; j<n;j++){
            System.out.println(arr[j]);
        }





    }
    
}
