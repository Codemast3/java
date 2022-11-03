package studentuse_3267;
import studentuse_3267.fraction;

public class fractionuse {
    public static void main(String[] args) {
        fraction f1 = new fraction(20,30);
        f1.print();
        f1.setnumerator(12);
            int d = f1.getdenominator();
            System.out.println(d);
            f1.print();
        }
    }
    

