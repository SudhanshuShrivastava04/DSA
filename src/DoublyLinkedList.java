public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node back;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }

        public Node(int data,Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        Node head = convertArrayToDoublyLinkedList(arr);
        print(head);
        head = deleteIndex(head,2);
        System.out.println();
        print(head);

    }

    private static Node convertArrayToDoublyLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i<arr.length; i++){
            prev.next = new Node(arr[i], null, prev);
            prev = prev.next;
        }

        return head;
    }

    private static void print(Node head){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "<->");
            current = current.next;
        }
    }

    private static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }

    private static void deleteTail(Node head){
        Node tail = head;

        while (tail.next != null){
            tail = tail.next;
        }

        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

    }

    private static Node deleteIndex(Node head, int i){
        if(head == null) return head;

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            if(count == i) break;
            temp = temp.next;
        }

        assert temp != null;
        Node prev = temp.back;
        Node front = temp.next;

        if(prev == null && front == null) return null;
        else if(prev == null){
            head = deleteHead(head);
            return head;
        } else if(front == null){
            deleteTail(head);
            return head;
        } else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }

        return  head;
    }

}
