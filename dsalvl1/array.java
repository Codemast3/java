public class array{
    public static void main(String[] args) {
        int[] arr;//declaring array
        arr = new int[6];
        arr[0]=3;//array storing
        arr[1]=5;
        arr[2]=8;
        arr[3]=7;
        arr[4]=9;
        arr[5]=4;
        for(int i = 0; i<arr.length; i++){//using for loop 
            System.out.println(arr[i]);//print command
        }
    }
}