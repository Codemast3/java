public class exp {
    public static void main(String[] args) {
        try{
            int [] numbers = {1,2,3};
            System.out.println(numbers[10]);
        }
        catch(Exception e){
            System.out.println("something is wrong in code");

        }finally{
            System.out.println("try catch finished");
        }
    }
    
}
