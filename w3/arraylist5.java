import java.util.ArrayList;
 class arraylist5 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("grapes");
        fruit.add("dates");
        for(int i = 0 ;i<fruit.size(); i++){
            System.out.println(fruit.get(i));
        }
    }
       
}
