class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class removennodeend{
    public static Node<Integer> removeNthFromEnd(Node<Integer> head, int n) {
        Node<Integer> dummy = new Node<>(0);
        dummy.next = head;
        Node<Integer> first = dummy;
        Node<Integer> second = dummy;

        // Move first pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (first != null) {
                first = first.next;
            }
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the Nth node from the end
        if (second.next != null) {
            second.next = second.next.next;
        }

        return dummy.next; // Return the modified list
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);
        head.next.next.next.next = new Node<>(5);
        head.next.next.next.next.next  = new Node<>(6);
        head.next.next.next.next.next.next = new Node<>(7);
        head.next.next.next.next.next.next.next  = new Node<>(8);
        int n = 5;

        Node<Integer> result = removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
