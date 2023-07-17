public class stackuselinklst {
    public static void main(String[] args) {
        stackusingll<Integer> stack = new stackusingll<>();
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
