public class ageexp {
    static void checkage(int age){
    if (age < 18) {
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      }
      else {
        System.out.println("Access granted - You are old enough!");
      }
    }
  
    public static void main(String[] args) {
      checkage(24); // Set age to 15 (which is below 18...)
    }
   }
    

