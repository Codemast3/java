import java.util.Scanner;

class loancal {
    public static void main(String[] args){
    Scanner jod = new Scanner(System.in);
    int amount = jod.nextInt();
    for(int i=0;i<6;i++){
        amount = amount*9/10;
    }
        System.out.println(amount);
        
    }
}

