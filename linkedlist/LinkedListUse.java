 class Node<T> {
    T data;
    Node1<T> next;
    Node(T data){
      this.data = data;
    }
  }
  public  class LinkedListUse{

    public static void print(Node1<Integer> head){
       Node1<Integer> temp = head;

       while(temp != null){
           System.out.print(temp.data +" ");
           temp = temp.next;
       }
       System.out.println();
   }
   
   public static void increment(Node1<Integer> head){
       Node1<Integer> temp = head;
       while(temp != null){
           temp.data++;
           temp = temp.next;
       }
   }

   public static void main(String args[]){
   
       Node1<Integer> node1 = new Node1<Integer>(10);
       Node1<Integer> node2 = new Node1<Integer>(20);
       node1.next = node2;
       increment(node1);
       print(node1);
      }
   }