package studentuse;

import javax.management.relation.RoleNotFoundException;

public class student {
    public String name;
    // final data members can be initialised as soon as they are declared 
    private final int rollnumber =100;
    public student(int num){
        rollnumber = num;
        name = "abc";
    }

    

public student(String str, int num){//user defined constructor
  rollnumber = num;
  name = str;
    
}
public void print(){
    System.out.println( name + "  " + rollnumber);
}
}
