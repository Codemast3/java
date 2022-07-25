import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter name ,quantity and taste : ");

        String name = myobj.nextLine();
        int quantity = myobj.nextInt();
        String taste = myobj.nextLine();
         




        System.out.println("name : " + name);
        System.out.println("quantity : "+ quantity);
        System.out.println("taste : "+ taste);
    }
    
}
