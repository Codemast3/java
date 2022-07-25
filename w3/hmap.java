import java.util.HashMap;
public class hmap {
    public static void main(String[] args) {
        HashMap<String,String> fruittaste = new HashMap<>();
        // add keys and values
        fruittaste.put("apple","sweet");
        fruittaste.put("orange","sour");
        fruittaste.put("banana","sweet");
        fruittaste.put("strawbeery","sweet");
        System.out.println("fruittaste : ");
        System.out.println(fruittaste);
        for( String i : fruittaste.keySet()){
        System.out.println(i);}
        // to print key and values
        for( String i : fruittaste.keySet()){
            System.out.println("key : " + i + "value : "+fruittaste.get(i));
        }
    }
    
}
