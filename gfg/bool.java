

public class bool {
    static boolean checkprime(long n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
    public static void main(String[] args){
        long n=17;
        System.out.println(checkprime(n));
    }
    
}
//program for checking the given number is prime or not since no scanner or input cmd is given we will try this func later on //
// i will have to keep moving forward