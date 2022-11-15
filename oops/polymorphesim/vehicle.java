 class  ve{
    public static void run(){System.out.println("vehiclle running");}

    
}
class bike extends ve {
   public static void run(){
        System.out.println("bike running safely");
    }

class vehicle{
public static void main(String[] args) {
    bike obj = new bike();
    obj.run();

}
}}
 
