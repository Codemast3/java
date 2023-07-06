public class stackuse {
    public static void main(String[] args) {
        stackusingarr stack = new stackusingarr();
        for(int i = 1; i<=5; i++){
            stack.push(i);

        }
        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }
            catch (Exception e){


            }
        }
    }
    
}
