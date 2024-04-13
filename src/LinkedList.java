public class LinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{7,8,9,10};
        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(3);
        x.next = y;
        y.next = z;

        Node head1 = x;

        while(head1 != null){
            System.out.println(head1.data);
            head1 = head1.next;
        }

        Node head2 = convertArrayToLinkedList(arr);
        Node current = head2;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Length of List 1 : " + LengthofLinkedList(head1));
        System.out.println("Length of List 2 : " + LengthofLinkedList(head2));
        System.out.println("Index of 9 in list 2 : " + searchNode(head2,9));
    }

    public static class Node {
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

    public static int LengthofLinkedList(Node head){
        int count = 0;

        Node temp = head;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static int searchNode(Node head, int target){
        int index = 0;

        Node temp = head;

        while(temp != null){
            if(temp.data == target){
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
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
