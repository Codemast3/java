public class stackusingarr {
   private  int[] data;
   private static int top;

    public stackusingarr() {
        
        data = new int[10];
        top = -1;

    
    }
    public stackusingarr(int capacity) {
        data = new int[capacity];
        top = -1;
    }
    public static boolean isEmpty(){
        return (top == -1);
    }
    public int size (){
        return top + 1;

    }
    public int top (){
      if(size() == 0){
        //stacke
        exeptionstack e = new exeptionstack();
      }
      return data[top];

    }
    /**
     * @param item
     */
    public void push(int elem ){
        if(size()==data.length){
            //stackfull
             stackfull e = new stackfull();
             //throw e;
            
        }
        top++;
        
        data [top] = elem;
    }
    /**
     * @return
     */
    public int  pop(){
            
        if(size()==data.length){
            //stackfull
           stackfull e = new stackfull();
          // throw e;
            
        }

    {
        int temp = data[top];
        top--;
        return temp;

    }

}
}












