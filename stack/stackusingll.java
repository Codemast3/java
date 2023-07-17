

public class stackusingll <T> {
    private Node<T> head;
    private int size;


    public stackusingll(){
        head = null;//head of linked list 
        size = 0;

    }
    int size(){
        return size;


    }
    boolean isEmpty(){
        return size()==0;// head will be null 

    }


    T top(){
       /*{
            if (size()==0){
                throw new exeptionstack();
            }*/
        
        return head.data;


    }

    

    void push(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        size++;


    }
    T pop(){
        T tempdata = head.data;
        head = head.next;
        size--;
        return tempdata;


    }

    
    }

    
    
    

