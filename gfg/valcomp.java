import java.math.BigInteger;

public class valcomp {
    public static void main(String[] args)
    {
        int n = 19,n2 = 23;
        BigInteger val=BigInteger.valueOf(n);
        BigInteger val2=BigInteger.valueOf(n2);
        System.out.println(val.compareTo(val2));
    }
    
}
