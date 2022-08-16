import java.util.Scanner;

public class findelemarr{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();

        }
        int data = scn.nextInt();
        int index = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==data){
                index=i; 
                break;
            }
        }
System.out.println(index);
        
    }
        
    }
