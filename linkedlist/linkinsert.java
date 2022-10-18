import java.util.Scanner;
public class linkinsert {
    public static Node<Integer> takeinput(){
         
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

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

        

        public static Node<Integer> insert(Node<Integer> head, int data,  int pos ) {
        Node<Integer> newnode = new Node<Integer>(data);
        if(pos == 0){
            newnode.next = head;
            return newnode;


        }
        int i = 0;
        Node<Integer> temp = head;
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;

        }
    
        public static void main(String[] args) {
            Node<Integer> head = takeinput();
           head = insert(head,80,0);
            print(head);
        }
    }
            
        

    

    

