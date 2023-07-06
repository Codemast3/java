
public class fraction {
    private int numerator;
    private int denominator;

 public fraction ( int numerator,int denominator){
    this.numerator = numerator;
    if( denominator == 0){// this  function is used to access private int numerator
    return;

    //error out
    }
    this.denominator = denominator;
    simplyfy();
 }   
 public int getdenominator(){
    return denominator;

 }
 public int getnumirator(){
    return numerator;
 }
 public void setnumerator(int n){
    this.numerator =  n ;
    simplyfy();
 }
 public void setdenominator(int d){
   if(d==0){
      //1000 error out
      return;
   }
   this.denominator = d;
   simplyfy();
 }
 public void print(){
   if(denominator==1){
      System.out.println(numerator);
   }else{
      System.out.println(numerator + "/" + denominator);

   }

 }
 private  void simplyfy(){
   int gcd = 1;
   int smaller = Math.min(numerator, denominator);
   for( int i = 2; i<= smaller; i++){
      if(numerator%i==0 && denominator % i ==0){
         gcd = i;
      }
   }
   numerator = numerator/gcd;
   denominator = denominator/gcd;

 }
 public fraction fractionadd(fraction f1, fraction f2){
   int newnum = f1.numerator * f2.denominator + f2.denominator *f1.denominator;
   int newden= f1.denominator*f2.denominator;
   fraction f = new fraction(newnum, newden);
   return f;

 }
 public void add(fraction f2 ){
   this.numerator = this.numerator*f2.denominator + this.denominator*f2.denominator;
   this.denominator = this.denominator*f2.denominator;
   simplyfy();
   
 }
 public void multiply(fraction f2){
this.numerator = this.numerator*f2.numerator;
this.denominator = this.denominator*f2.denominator;
simplyfy();
 }
}
