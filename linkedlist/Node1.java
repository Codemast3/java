import javax.annotation.processing.SupportedOptions;



public class Node1{
    
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
        Node<Integer> node1 = new Node<Integer>(10);//first node 
       // System.out.println(node1.data); 
        Node<Integer> node2 = new Node<Integer>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        node1.next=node2;
        node2.next=node3;
       // System.out.println(node3);//address of node 2
        //System.out.println(node3.next);
        Node<Integer> head = node1;
        print(head);
        //print(head);
    
    }
}

    

