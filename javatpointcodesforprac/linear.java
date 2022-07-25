public class linear {
    public static int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){//this code gonna print array lenth index
            if(arr[i]==key){//arr decribed as key 
                return i;// returning value 
            }
        }
        return -1;//return value -1

    }
    public static void main(String[] args) {
        int[] a1={10,20,30,50,70,90};//array a1 
        int key = 50;//key given  for sorting result 
        System.out.println(key + "is found at index: " + linearsearch(a1, key));//printing command 

    }
    
}
