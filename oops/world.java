class t1 {
    t1() {
        System.out.println("enter the value of a" +"");
    }

    void show() {
        System.out.println("this is ist class  ");

    }

    void point() {
        System.out.println("this is second class");
    }
}
class t2 extends t1{
       t2(){
           System.out.println("this is t2");
       }
       void show(){
           System.out.println("this class is override");
                   }
       void point(){
           System.out.println("this class is not override");
       }
   }
   class world{
   public static void main(String[] args) {
       t1 t=new t1();
       //t1 te=new t1(78);
       t.show();
      //te.show();
       t2 tf=new t2();
       tf.show();
       t1 T= new t2();
      T.point();
   }
   }