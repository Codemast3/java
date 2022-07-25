 class ind {
    int x = 20;//ind is outer class 
    class innerclass{
        public int myinnermethod(){
            return x;// inner class 
        }
    }
 }
public class inc{
     public static void main(String[] args) {
         ind myouter = new ind();
         ind.innerclass myinner = myouter.new innerclass();
         System.out.println(myinner.myinnermethod());
     }
 }
   

