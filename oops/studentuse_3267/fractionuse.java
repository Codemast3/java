

public class fractionuse {
    public static void main(String[] args) {
        fraction f1 = new fraction(20,30);
        f1.print();
        f1.setnumerator(12);
            int d = f1.getdenominator();
            System.out.println(d);
        f1.print();
        
        f1.setnumerator(10);
        f1.setdenominator(30);
        f1.print();


        //add program of fractions
        fraction f2 = new fraction(3, 4);
        f1.add(f2);
        f1.print();
        f2.print();

        // third object for multiplication of fractions
        fraction f3 = new fraction(4, 5);
        f3.multiply(f2);
        f3.print();
        f2.print();
    }
}
    

