abstract class animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("zzz");
    }
}
class lion extends animal{
    public void animalsound(){
        System.out.println("roar");
    }
}



class absdtract {
    public static void main(String[] args) {
        lion mylLion = new lion();
        mylLion.animalsound();
        mylLion.sleep();
    }
    
}//to access abstract class,it must be inherited from other class

