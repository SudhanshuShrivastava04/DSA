public class DeleteNodeinLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};

        Node head = convertArrayToLinkedList(arr);
        print(head);
        System.out.println();
        head = deleteIndex(head,1);
        print(head);
        System.out.println();
        head = deleteElement(head,3);
        print(head);
    }

    private static Node deleteIndex(Node head, int k){
        if(head == null) return head;

        if(k == 1){
            head = head.next;
            return  head;
        }

        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    private static Node deleteElement(Node head, int k){
        if(head == null) return head;

        if(head.data == k){
            head = head.next;
            return  head;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void print(Node head){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "->");
            current= current.next;
        }
    }


    public static Node convertArrayToLinkedList(int[] arr){
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }

        return head;
    }

}
