package concept;


import java.util.Scanner;
import concept.Node;




public class insertnod {

    public static Node<Integer> takeinput() {
        Node<Integer> head = null, tail =null;
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();  
        


        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail= newNode; // tail = tail.next

            }else{
               Node<Integer> temp = head;
               while(temp.next!=null){
                temp = temp.next;
                }
                temp.next = newNode;

            }

            data = scn.nextInt();
        }
        return head;

    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(head != null){
        System.out.print(head.data + " ");
        head = head.next;
        }
        System.out.println();
        /*head = temp;
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
            }*/
    
       } 
         public static void main(String[] args) {
            
        
           // Node<Integer> node1 = new Node<Integer>(10);//first node 
           // System.out.println(node1.data); 
          
           // System.out.println(node3);//address of node 2
            //System.out.println(node3.next);
            Node<Integer> head = takeinput();
            print(head);
            //print(head);
        
        }
    
}
