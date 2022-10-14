import java.util.ArrayList;

public class arraydemolist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
    
        System.out.println(list1.size());
        list1.add(16);
        list1.add(20);//adding an element
        list1.add(25);
        list1.add(2,50);
        System.out.println(list1.size() 
        );
        System.out.println(list1.get(2));
        for (int i = 0;i<list1.size(); i++){
            System.out.println(list1.get(i)+" ");
        }
        System.out.println();
        list1.remove(1);
        for (int i = 0;i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        
    }
    
}
}
