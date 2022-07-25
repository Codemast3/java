public class transposemtrx {
    public static void main(String[] args){
        int jod[][]={{1,6,7},{5,6,7,8},{8,7,6}};
        int cod[][]=new int[3][3];
        //code for transpose of a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                cod[i][j]=jod[j][i];
            }
        }
        System.out.println("printing 1st matrx");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(jod[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("2nd cod matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(cod[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
