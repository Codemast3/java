public class polynomial {
    
    int degree;
    int coefficient;
    dynamicarray dy;
    public polynomial(){
        degree = 0;
        coefficient = 0;
        dy = new dynamicarray();
    }
    public void set (int degree,int collection) {
        this.degree  = degree;
        this.coefficient = coefficient;
        this.dy.set(degree,coefficient);
    }
    public void add(polynomial p2){



        int length = this.dy.size()<=p2.dy.size()?this.dy.size():p2.dy.size();
        for (int i = 0;i<length;i++){
            if(this.dy.get(i) != 0 || p2.dy.get(i) !=0)
            {
                int add = this.dy.get(i)+p2.dy.get(i);
                this.dy.set(i,add);

            }
        }


    }
    public void multiply(polynomial p2)
    {
        polynomial p3 = new polynomial();
        for(int i = 0;i<this.dy.size();i++){
            int product = 0;
            for(int j = 0;j<p2.dy.size();j++){
                if(this.dy.get(i)=0 || p2.dy.get(j)==0){
                    product = 0 ;

                    continue;

                }
                product = p3.dy.get(i+j) +this.dy.get(i) *p2.dy.get(j);
                p3.set((i+j),product);
            }
            for(int k = 0;k<p3.dy.size();k++){
                this.dy.set(i,p3.dy.get(i));

            }
        }
    }
    public int evaluate(int x)
{
    int product = 0;
    for (int i = 0;i<this.dy.size();i++){
        int elem = this.dy.get(i);
        int evaluate = (int)Math.pow(x,i)*elem;
        product += evaluate;

    }
return product;

}
public void print (){
    String result = " ";
    for(int i = 0;i<this.dy.size();i++){
        if(dy.get(i)==0)
        {
            continue;
        }else{
            result += dy.get(i)+"x^"+i+"+";
        }
    }
    System.out.println(result);

}

        
    }
class polynomialuse{
    public static void main(String[] args) {
        polynomial p1 = new polynomial();
        p1.set(2,1);
        p1.set(0,5);
        p1.print();

    }
}

