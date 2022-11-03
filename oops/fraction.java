public class fraction {
    private int numerator;
    private int denominator;

 public fraction ( int numerator,int denominator){
    this.numerator = numerator;
    if( denominator == 0){

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
 public void setnumerator(){
    this.numerator = int n ;
    simplify();
 }
}
