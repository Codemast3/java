public class addmatrx {
    public static void main(String[] args){
        int a[][]={{1,3,4},{3,4,5},{4,4,3}};
        int b[][]={{4,5,3},{6,5,4},{5,4,3}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            } 
            System.out.println();  

        }
    
    }
    
}
// ps = i have used this program for multiplication of matrix
